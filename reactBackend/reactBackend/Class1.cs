using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Drawing;
using reactBackend.Models;

namespace reactBackend
{
    public class AlumnoDAO
    {
        #region Contex

        public RegistroAlumnoContext contexto = new RegistroAlumnoContext();
        #endregion

        #region Select All

        public List<Alumno> SelectAll()
        {

            var alumno = contexto.Alumnos.ToList<Alumno>();
            return alumno;
        }
        #endregion
    }
}
