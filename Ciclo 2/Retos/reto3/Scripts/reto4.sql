SELECT DISTINCT L.Nombre || ' ' || L.Primer_Apellido AS 'Lider',L.Cargo,
	COUNT(P.ID_Proyecto) AS 'Proyectos'
FROM Lider AS L
INNER JOIN Proyecto AS P ON P.ID_Lider = L.ID_Lider 
WHERE  P.Constructora = 'Arquitectura S.A.'
GROUP BY  L.ID_Lider
ORDER BY Cargo,Lider;

--Requerimiento 1
SELECT Nombre || ' ' || Primer_Apellido as Lider,Cargo,COUNT(p.ID_Lider) as 'nProyectos'
FROM Lider l,Proyecto p
WHERE p.Constructora = 'Arquitectura S.A.' and p.ID_Lider = l.ID_Lider
GROUP BY l.ID_Lider
ORDER BY Cargo,Lider ;

--Requerimeinto 2
SELECT M.ID_MaterialConstruccion,M.Nombre_Material,C.Cantidad,
	M.Precio_Unidad,( C.Cantidad * M.Precio_Unidad ) AS Precio_Total
FROM Compra AS C
INNER JOIN MaterialConstruccion AS M ON M.ID_MaterialConstruccion = C.ID_MaterialConstruccion
INNER JOIN Proyecto AS P ON P.ID_Proyecto = C.ID_Proyecto
WHERE P.ID_Proyecto IN (10, 14, 23, 24, 38, 50, 29)
ORDER BY P.ID_Proyecto ASC,M.Precio_Unidad DESC;


--Requerimiento 3
SELECT DISTINCT P.ID_Proyecto,P.Ciudad,P.Clasificacion,
	SUM(C.Cantidad * MC.Precio_Unidad) AS 'Costo_Proyecto'
FROM Proyecto AS P
INNER JOIN MaterialConstruccion AS MC ON
	MC.ID_MaterialConstruccion = C.ID_MaterialConstruccion
INNER JOIN Compra AS C ON C.ID_Proyecto = P.ID_Proyecto
WHERE P.Ciudad IN ('Monteria', 'Santa Marta')
GROUP BY P.ID_Proyecto
HAVING SUM(C.Cantidad * MC.Precio_Unidad) > 70000
ORDER BY P.Ciudad ,P.Clasificacion,P.ID_Proyecto;
