using reactBackend;
using reactBackend.Models;

AlumnoDAO alumnoDao = new AlumnoDAO();


Console.WriteLine(" ");

#region SelectByID
var selectById = alumnoDao.GetbyId(1);
Console.WriteLine(selectById?.Nombre);
#endregion




