using reactBackend;
using reactBackend.Models;

AlumnoDAO alumnoDao = new reactBackend.AlumnoDAO();

var alumno = alumnoDao.SelectAll();

foreach (var item in alumno)
{
    Console.WriteLine(item.Nombre);
}



