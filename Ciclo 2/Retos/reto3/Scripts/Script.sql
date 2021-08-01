--Punto1
SELECT
	DISTINCT Documento_Identidad,
	Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido as Lider, 
	Ciudad_Residencia,
	Salario
FROM
	Lider l
WHERE
	Cargo = 'Coordinador'
ORDER by
	Documento_Identidad ;


--Punto 2
SELECT
	DISTINCT Constructora,
	Clasificacion,
	Ciudad
FROM
	Proyecto p
WHERE
	Banco_Vinculado = 'Colmena'
ORDER BY
	Constructora,
	Clasificacion,
	Ciudad ;


--Punto 3
SELECT 
	Nombre || ' ' || Primer_Apellido as Lider,
	Cargo,
	COUNT(p.ID_Lider) 
as '# Proyectos'
FROM
	Lider l,
	Proyecto p
WHERE
	p.Constructora = 'Arquitectura S.A.' and p.ID_Lider = l.ID_Lider 
GROUP BY
	l.ID_Lider
ORDER BY
	Cargo,
	'# Proyectos',
	Lider ;
	

--Punto 4
SELECT
	mc.ID_MaterialConstruccion,
	Nombre_Material ,
	c.Cantidad,
	Precio_Unidad,
	c.Cantidad * Precio_Unidad as Precio_Total
FROM
	MaterialConstruccion mc,
	Compra c
WHERE c.ID_Proyecto IN (10, 14, 23, 24, 38, 50, 29)
ORDER BY
	c.ID_Proyecto ASC,
	Precio_Unidad DESC;
	
--Punto 4 (Completo)
SELECT
	M.ID_MaterialConstruccion,
	M.Nombre_Material,
	C.Cantidad,
	M.Precio_Unidad,
	( C.Cantidad * M.Precio_Unidad ) AS Precio_Total
FROM
	Compra AS C
INNER JOIN MaterialConstruccion AS M ON
	M.ID_MaterialConstruccion = C.ID_MaterialConstruccion
INNER JOIN Proyecto AS P ON
	P.ID_Proyecto = C.ID_Proyecto
WHERE
	P.ID_Proyecto IN (10, 14, 23, 24, 38, 50, 29)
ORDER BY
	P.ID_Proyecto ASC,
	M.Precio_Unidad DESC;

--Punto 5
