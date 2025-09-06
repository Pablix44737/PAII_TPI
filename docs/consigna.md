# Consigna – Trabajo Práctico Final 2025  
**Programación Avanzada II – Fernando Aguirre**  

---

## Escenario  
**Sistema de Gestión de una Colonia de Gatos Callejeros**  

Se desarrollará un sistema para gestionar una colonia urbana de gatos callejeros mantenida por una red de voluntarios.  

El sistema debe permitir:  
- Registrar gatos, su ubicación, estado de salud, alimentación, esterilización.  
- Controlar tareas realizadas por los voluntarios (alimentación, controles veterinarios, adopciones temporales, etc.).  
- Permitir que veterinarios y rescatistas interactúen con el sistema.  

---

## Requisitos Funcionales Obligatorios  

### 1. Gestión de Gatos  
- Registro de gatos por parte de voluntarios con datos: nombre (opcional), color, características, foto, zona, estado de salud.  
- Actualización de estado: **enfermo, sano, en tratamiento, esterilizado**.  
- Asignación de **código QR** por gato para escaneo rápido.  

### 2. Gestión de Tareas  
- Los voluntarios pueden registrar tareas realizadas:  
  - Alimentación  
  - Captura para castración  
  - Control veterinario  
  - Transporte a hogar transitorio  
- Cada tarea debe registrar fecha, hora, voluntario y ubicación.  

### 3. Adopciones Temporales y Definitivas  
- Registro de hogares disponibles para tránsito o adopción.  
- Los voluntarios pueden asignar un gato a una familia y registrar visitas de seguimiento.  
- Las familias pueden registrarse, ver perfiles de gatos disponibles y postularse para adoptar.  

### 4. Seguimiento Veterinario  
- Los veterinarios registrados pueden acceder al historial médico del gato.  
- Pueden actualizar diagnósticos y tratamientos, subir estudios y emitir certificados de aptitud para adopción.  

### 5. Roles y Permisos  
- **Voluntario**: registra gatos y tareas.  
- **Veterinario**: gestiona salud y tratamiento.  
- **Administrador**: gestiona usuarios, zonas y reportes.  
- **Familia adoptante**: puede registrarse, ver gatos y postularse.  

### 6. Reportes y Mapas  
- Mapa geolocalizado con los puntos de avistamiento o zona de gatos.  
- Reportes: cantidad de gatos por zona, gatos esterilizados, gatos adoptados.  

---

## Requisitos Funcionales Adicionales  
- Calendario de tareas con asignación automática de voluntarios.  
- Alertas por vencimiento de tratamientos o visitas.  
- Sistema de reputación para familias adoptantes y voluntarios.  

---

## Presentación del Trabajo  

### Requerimientos  
1. **Diagrama de clases** de la solución propuesta (en formato impreso y legible).  
   - *Nota: sin este documento no se evaluará el práctico.*  
2. **Aplicación Desktop** en **Java**, contemplando todas las funcionalidades.  
3. **Aplicación Web** en **Java (JSP)**, con funcionalidades para voluntarios y familias.  
   - Debe basarse en el mismo modelo que la aplicación Desktop.  

### Modalidad  
- El trabajo puede realizarse en grupos de **máximo 2 alumnos**.  
- La entrega será **individual**, a través del aula virtual.  
- Habrá una **defensa oral** posterior en clase.  
