
(deftemplate ResultadoTest
	(slot respuesta
		(type STRING)
		(default ?DERIVE)
	)
    (slot puntaje
		(type NUMBER)
		(default ?DERIVE)
	)
    )

(deftemplate Test
	(slot Pregunta1
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta2
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta3
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta4
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta5
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta6
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta7
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta8
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta9
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    (slot Pregunta10
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta11
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta12
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta13
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta14
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta15
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta16
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta17
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
	(slot Pregunta18
		(type NUMBER)
		(default ?DERIVE)
		;(allowed-symbols 1 2)
	)
    
    )
    ;(assert (Test                    
	;(Pregunta1 1)
    ;(Pregunta2 2)
    ;(Pregunta3 1)
    ;(Pregunta4 2)
    ;(Pregunta5 1)
    ;(Pregunta6 2)
    ;(Pregunta7 1)
    ;(Pregunta8 2)
    ;(Pregunta9 1)
    ;(Pregunta10 2)
    ;(Pregunta11 1)
    ;(Pregunta12 2)
    ;(Pregunta13 1)
    ;(Pregunta14 2)
    ;(Pregunta15 1)
    ;(Pregunta16 2)
    ;(Pregunta17 1)
    ;(Pregunta18 2)
	;)
;)

(defrule regla1
	 (Test  
			(Pregunta1 ?a)
            (Pregunta2 ?b)
            (Pregunta3 ?c)
            (Pregunta4 ?d)
            (Pregunta5 ?e)
            (Pregunta6 ?f)
            (Pregunta7 ?g)
            (Pregunta8 ?h)
            (Pregunta9 ?i)
            (Pregunta10 ?j)
            (Pregunta11 ?k)
            (Pregunta12 ?l)
            (Pregunta13 ?m)
            (Pregunta14 ?n)
            (Pregunta15 ?o)
            (Pregunta16 ?p)
            (Pregunta17 ?q)
            (Pregunta18 ?r)
	 	)
                         
=>
     (bind ?r (+ ?a ?b ?c ?d ?e ?f ?g ?h ?i ?j ?k ?l ?m ?n ?o ?p ?q ?r))   

  (if
    (< ?r 10)
    then
        (printout t  "Discapacidad Motriz Minima ("?r" puntos)" crlf)
        (assert (ResultadoTest (respuesta "Minima")
                          (puntaje ?r)))
                     
    else (if (and 
        
            (> ?r 12 )(< ?r 15)
        )then 
            (printout t  "Discapacidad Motriz Media("?r" puntos)"crlf)
            (assert (ResultadoTest (respuesta "Media")
                               (puntaje ?r)))
            
   else (if(and 
        
            (> ?r 18 )(< ?r 22)
        )then 
            (printout t "Discapacidad Motriz Media Alta("?r" puntos)"crlf)
            (assert (ResultadoTest (respuesta "MediaAlta")
                                (puntaje ?r))) 

   else (if(and 
        
            (> ?r 24 )(< ?r 28)
        )then 
            (printout t "Discapacidad Alta("?r" puntos)"crlf)
            (assert (ResultadoTest (respuesta "Alta")
                                (puntaje ?r)))


   else (if
        
            (< ?r 37 )
        then 
            (printout t  "Discapacidad Motriz Severa("?r" puntos)" crlf)
            (assert (ResultadoTest (respuesta "Severa")
                                (puntaje ?r)))
       				     )
     			    )
   			  )
 		 )
	)	
)
