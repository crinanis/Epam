using Aircompany.Models;

namespace Aircompany.Planes
{
    public class MilitaryPlane : Plane
    {
        public readonly MilitaryType MilitaryType;

        public MilitaryPlane(string planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType)
            : base(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity)
        {
            MilitaryType = militaryType;
        }

        public override bool Equals(object obj)
        {
            var plane = obj as MilitaryPlane;
            return plane != null && base.Equals(obj) && MilitaryType == plane.MilitaryType;
        }

        public override int GetHashCode()
        {
            var hashCode = 1701194404;
            hashCode = hashCode * -1521134295 + base.GetHashCode();
            hashCode = hashCode * -1521134295 + MilitaryType.GetHashCode();
            return hashCode;
        }

        public MilitaryType GetPlaneType()
        {
            return MilitaryType;
        }


        public override string ToString()
        {
            return base.ToString().Replace("}", ", type=" + MilitaryType + '}');
        }
    }
}
