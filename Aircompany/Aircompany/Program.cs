using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Aircompany
{
    class Program
    {
        public static void Main(string[] args)
        {
            Airport airport = new Airport(PlanesList.Planes);
            Airport militaryAirport = new Airport(airport.GetMilitaryPlanes());
            Airport passengerAirport = new Airport(airport.GetPassengersPlanes());
            Console.WriteLine(militaryAirport.SortPlanesByMaxFlightDistance().ToString());
            Console.WriteLine(passengerAirport.SortPlanesByMaxSpeed().ToString());
            Console.WriteLine(passengerAirport.GetPassengerPlaneWithMaxPassengersCapacity());
        }
    }
}
