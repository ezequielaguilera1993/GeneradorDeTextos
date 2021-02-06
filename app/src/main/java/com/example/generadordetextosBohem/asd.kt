package com.example.generadordetextosBohem

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_inputs.*
import kotlinx.android.synthetic.main.activity_main.th1

class asd : AppCompatActivity() {
    ///wslttgpohhha sasd
    var selector = "1" //por defecto esta configurado en bebes

    //variables fijas
    var f = ""

    //variables
    var pf: String? = null //enl pub facebook

    //fijas misma para todos los cursos
    var pi: String? = null
    var pc: String? = null
    var meet: String? = null
    var rat: String? = null
    var encuentro: String? = null
    var eM: String? = null
    var em: String? = null
    var eMm: String? = null
    var d: String? = null
    var c: String? = null
    var cc: String? = null
    var w: String? = null
    var enMp: String? = null
    var costo: String? = null
    var h: String? = null


    ////////BEBES, las variables de uso en botones unicos las saco de bebes, es para abrir la puerta a que sea mas facil modificar las cosas, poenele en el futuro quiero usar diferetnes
    //planillas de inscripcion para cada curso, bueno ya lo tengo armado asi y listo
    var pf3: String? = null //enl pub facebook
    var pi3: String? = null
    var pc3: String? = null
    var meet3: String? = null
    var rat3: String? = null
    var encuentro3: String? = null
    var eM3: String? = null
    var em3: String? = null
    var eMm3: String? = null
    var d3: String? = null
    var c3: String? = null
    var cc3: String? = null
    var w3: String? = null
    var enMp3: String? = null
    var costo3: String? = null
    var h3: String? = null

    /////////////////////bebes heimlich
    var pf4: String? = null //enl pub facebook
    var pi4: String? = null
    var pc4: String? = null
    var meet4: String? = null
    var rat4: String? = null
    var encuentro4: String? = null
    var eM4: String? = null
    var em4: String? = null
    var eMm4: String? = null
    var d4: String? = null
    var c4: String? = null
    var cc4: String? = null
    var w4: String? = null
    var enMp4: String? = null
    var costo4: String? = null
    var h4: String? = null
/////////////////////adultos rcp

/////////////////////adultos heimlich


    /*f
pf
pi
pc
meet
rat
encuentro
eM
em
eMm
d
c
cc
w
enMp
costo*/

    //----//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputs)

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = prefs.edit()

        s1.isChecked =
            true //por defecti el selector 1 es el que esta seleccionado, para dar indicacion visual


        tituloInputs.text =
                /*paciente*/
            "Bebes" + prefs.getString("etE1", "NO CARGO") //por defecto el text view es el de bebes
//pone el titulo de los inputs, dependiendo del valor del selector y agrega fecha y hora con et1
//hasta aca el selector es "1", esta maracdo el radio1, y el textView es de "1", ahora hay que cargar el editText en "1"
        //NOOOOOOOOOO SI POR DEFECTO ES SIEMPRE BEBES, ENTONCES SIEMPRE V A ASER BEBES EL TEXTVIEW CUANDO SE ABRE!!


        probar.setOnClickListener {

            pf3 = prefs.getString("etPf1", "")
            enMp3 = prefs.getString("etEnMp1", "")
            pi3 = prefs.getString("etPi1", "")
            pc3 = prefs.getString("etPc1", "")
            costo3 = prefs.getString("etCosto1", "")
            encuentro3 = prefs.getString("etE1", "")
            d3 = prefs.getString("etD1", "")
            c3 = prefs.getString("etC1", "")
            cc3 = prefs.getString("etCc1", "")
            w3 = prefs.getString("etW1", "")
            meet3 = prefs.getString("etMeet1", "")
            rat3 = prefs.getString("etRat1", "")
            h3 = prefs.getString("etH1", "")

            ///////////////////////////////////

            pf4 = prefs.getString("etPf2", "")
            enMp4 = prefs.getString("etEnMp2", "")
            pi4 = prefs.getString("etPi2", "")
            pc4 = prefs.getString("etPc2", "")
            costo4 = prefs.getString("etCosto2", "")
            encuentro4 = prefs.getString("etE2", "")
            d4 = prefs.getString("etD2", "")
            c4 = prefs.getString("etC2", "")
            cc4 = prefs.getString("etCc2", "")
            w4 = prefs.getString("etW2", "")
            meet4 = prefs.getString("etMeet2", "")
            rat4 = prefs.getString("etRat2", "")
            h4 = prefs.getString("etH2", "")


            th1.text =
                "encuentro1: " + encuentro3 + "\n" + "d1: " + d3 + "\n" + "pi1: " + pi3 + "\n" + "pc1: " + pc3 + "\n" + "c1: " + c3 + "\n" + "cc1: " + cc3 + "\n" + "w1: " + w3 + "\n" + "enMp1 " + enMp3 + "\n" + "costo1 " + costo3 + "\n" + "pf1: " + pf3 + "\n" + "rat1: " + rat3 + "\n" + "meet1: " + meet3 + "\n" + "horario1: " + h3 + "\n" + em3 + eM3 + eMm3 + "\n\n" + "encuentro: " + encuentro4 + "\n" + "d: " + d4 + "\n" + "pi: " + pi4 + "\n" + "pc: " + pc4 + "\n" + "c: " + c4 + "\n" + "cc: " + cc4 + "\n" + "w: " + w4 + "\n" + "enMp " + enMp4 + "\n" + "costo " + costo4 + "\n" + "pf1: " + pf4 + "\n" + "rat: " + rat4 + "\n" + "meet: " + meet4 + "\n" + "horario: " + h4 + "\n" + em4 + eM4 + eMm4 + "\n\n"

/*   println(""""encuentro$c: "+encuentro$c + "\n" +"d$c: "+d$c + "\n" + "pi$c: "+pi$c + "\n" + "pc$c: "+pc$c + "\n" + "c$c: "+c$c + "\n" + "cc$c: "+cc$c + "\n" +"w$c: "+w$c + "\n" + "enMp$c "+enMp$c + "\n" + "costo$c "+costo$c + "\n" + "pf$c: "+pf$c+"\n"+"rat$c: "+rat$c+"\n"+"meet$c: "+meet$c+"horario1: "+h1+"\n"+\n\n\n"""")
*/
        }


        //A la primera vuelta hace el setText del edit text con "1". Despues escucha editText guarda el teto y actualiza variables
        //costo pero es quizas la mejor funcion que hice
        etListener(etPf)
        etListener(etPi)
        etListener(etPc)
        etListener(etEnMp)
        etListener(etCosto)
        etListener(etMeet)
        etListener(etRat)
        etListener(etE)
        etListener(etD)
        //Classroom
        etListener(etC)
        etListener(etCc)
        //Enlace grupo de Whatsapp
        etListener(etW)
        etListener(etH)

        pf3 = prefs.getString("etPf1", "")
        enMp3 = prefs.getString("etEnMp1", "")
        pi3 = prefs.getString("etPi1", "")
        pc3 = prefs.getString("etPc1", "")
        costo3 = prefs.getString("etCosto1", "")
        encuentro3 = prefs.getString("etE1", "")
        eM3 = todoMayuscula(encuentro3.toString())
        //Encuentro en minuscula
        em3 = todoMinuscula(encuentro3.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm3 = empiezaMayuscula(encuentro3.toString())
        d3 = prefs.getString("etD1", "")
        c3 = prefs.getString("etC1", "")
        cc3 = prefs.getString("etCc1", "")
        w3 = prefs.getString("etW1", "")
        meet3 = prefs.getString("etMeet1", "")
        rat3 = prefs.getString("etRat1", "")
        h3 = prefs.getString("etH1", "")


        //esto de abajo lo pongo porque solo se definia las subVariables en el listener, entonces por defecto no se usaban
        eM4 = todoMayuscula(encuentro4.toString())
        //Encuentro en minuscula
        em4 = todoMinuscula(encuentro4.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm4 = empiezaMayuscula(encuentro4.toString())

        eM3 = todoMayuscula(encuentro3.toString())
        //Encuentro en minuscula
        em3 = todoMinuscula(encuentro3.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm3 = empiezaMayuscula(encuentro3.toString())

        eM4 = todoMayuscula(encuentro4.toString())
        //Encuentro en minuscula
        em4 = todoMinuscula(encuentro4.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm4 = empiezaMayuscula(encuentro4.toString())

//TEXTOS FIJOS
        button(btnPf)
        button(btnRpi)




//TEXTOS MULTIPLES: se ponen por tandas, una tanda por cada curso
        button(btnDgw1)//Descripcion de whatsapp
        button(btnN1)//novedades
        button(btnCqh1)//Classroom que hago ahora

        button(btnDgw2)//Descripcion de whatsapp
        button(btnN2)//novedades
        button(btnCqh2)//Classroom que hago ahora

        button(btnDgw3)//Descripcion de whatsapp
        button(btnN3)//novedades
        button(btnCqh3)//Classroom que hago ahora

        button(btnDgw4)//Descripcion de whatsapp
        button(btnN4)//novedades
        button(btnCqh4)//Classroom que hago ahora




//lo pongo bien abajo para que agarre los datos de todo el codigo para usarlos
        radioGrou.setOnCheckedChangeListener { group, checkedId ->
            val prefs = PreferenceManager.getDefaultSharedPreferences(this)

            when (checkedId) {
                R.id.s1 -> {
                    selector = "1"

                }
                R.id.s2 -> {
                    selector = "2"


                }
                R.id.s3 -> {
                    selector = "3"

                }
                R.id.s4 -> {
                    selector = "4"

                }

            }
            var paciente =
                when (selector) {//dice si se marco bebe o adulto, para el textView es nada mas
                    "1" -> "Rcp Bebes "
                    "2" -> "Heimlich Bebes "
                    "3" -> "Rcp Adultos "
                    "4" -> "Heimlich Adultos "
                    else -> "NO ANDUVO"
                }


            tituloInputs.text = paciente + prefs.getString("etE$selector", "NO CARGO")?.let {
                empiezaMayuscula(
                    it
                )
            }


            //ahora cambia el edit text segun el selector
            etPf.setText(prefs.getString("etPf$selector", ""))
            etEnMp.setText(prefs.getString("etEnMp$selector", ""))
            etPi.setText(prefs.getString("etPi$selector", ""))
            etPc.setText(prefs.getString("etPc$selector", ""))
            etCosto.setText(prefs.getString("etCosto$selector", ""))
            etE.setText(prefs.getString("etE$selector", ""))
            etD.setText(prefs.getString("etD$selector", ""))
            etC.setText(prefs.getString("etC$selector", ""))
            etCc.setText(prefs.getString("etCc$selector", ""))
            etW.setText(prefs.getString("etW$selector", ""))
            etMeet.setText(prefs.getString("etMeet$selector", ""))
            etRat.setText(prefs.getString("etRat$selector", ""))
            etH.setText(prefs.getString("etH$selector", ""))

            //no hace falta que cambie las variables, porque en donde se decide que variable se utiliza es en el button, segun que numero de button de use elije una variable o la otra. Y las variables cambian al editarse con el editText Listener

        }


    }

    @SuppressLint("SetTextI18n")
    fun button(id: Button) {

        id.setOnClickListener {
//Llego la hora del Golden When
            when (resources.getResourceEntryName(id.id).last().toString()) //ultima letra del button
            {
                "2" -> {
                    pf = pf4
                    pi = pi4
                    pc = pc4
                    meet = meet4
                    rat = rat4
                    encuentro = encuentro4
                    eM = eM4
                    em = em4
                    eMm = eMm4
                    d = d4
                    c = c4
                    cc = cc4
                    w = w4
                    enMp = enMp4
                    costo = costo4
                    h = h4

                }
                "3" -> {
                }
                "4" -> {
                }
                else -> { //esto es nada mas para incluir a los botones unicos que terminan en letra. Toman el valor de "1" por lo pronto
                    pf = pf3
                    pi = pi3
                    pc = pc3
                    meet = meet3
                    rat = rat3
                    encuentro = encuentro3
                    eM = eM3
                    em = em3
                    eMm = eMm3
                    d = d3
                    c = c3
                    cc = cc3
                    w = w3
                    enMp = enMp3
                    costo = costo3
                    h = h3
                }


            }



            when (id.hint) {
////IMPORTANTE, POR LO PRONTO LOS BOTONES FIJOS SE ALIMENTAN DE INPUTS DIFERENTES, PERO QUE TENDRAN EL MISMO TEXTO
////POR SI MAS ADELANTE HAY QUE ESCALARLO, QUE TODOS LOS CURSOS TENGAN TODOS LOS INPUTS PARA AGREGAR
//boton fijo pormel momento, pero de uso seguido



////////boton fijo por el miumento, pero de uso unico/////
                "btnRpi" -> th1.text =//var RespuestaPlanillaDeInscripcion =
                    """${i("RespuestaPlanillaDeInscripcion")}Bienvenid@! Ahora debe unirse al CLASSROOM $c y al GRUPO DE WHATSAPP $w. Debe unirse a los dos. No se haga problema si cuando toca alguno se cierra la página, en el Classroom está el enlace para unirse el grupo de WhatsApp y en la descripción del grupo de Whatsapp está el enlace para unirse al Classroom, recuerde unirse a los dos.
 $f"""

                "btnPf" -> th1.text =//var PublicacionFacebook =

                    """${i("Publicacion en Facebook")}CAPACITACIÓNES GRATUITAS $eM 
Modalidad virtual 🌎
• Con Classroom y material extra.
• Asistencia constante por mensajes de WhatsApp con el fin de facilitar la comunicación.

Hola soy Ezequiel, instructor en Primeros auxilios.
Son muchos los casos de Atragantamientos (principalmente) y Paros Cardíacos en bebés. El hecho de recluirnos en cuarentena no disminuye esta estadística... sigue sucediendo todos los días.
En respuesta a esta situación se dictaran 2 cursos
 • RCP en Bebés (para asistir en caso de paro cardiaco)
 • Maniobra de Heimlich en Bebés (para asistir en caso de atragantamiento)
Puede inscribirse a uno o a los dos, como le parezca. 

¿COMO ME INSCRIBO A LOS CURSOS?
• Complete la Planilla de Inscripción y elija cual curso quiere realizar(puede elejir ambos): $pi

CERTIFICACIÓN DE LOS CURSOS
Por cada curso habrá un certificado diferente. Es decir, si decide realizar los dos cursos puede solicitar 2 certificados.
 PUEDE REALIZAR LA CAPACITACION SIN ABONAR EL CERTIFICADO, ES TOTALMENTE OPCIONAL. LO ABONAN SOLO LAS PERSONAS QUE LO PRECISAN.
• La capacitacion es gratuita. Se entregarán certificados (OPCIONALES) firmados digitalmente abonando la suma de $costo$, con el fin de volverla redituable, sin dejar de capacitar a nadie. De esta manera puedo brindar conocimiento a cualquier persona con acceso a internet y también trabajar de esto. Tenga en cuenta que es exactamente el mismo curso se abone o no el certificado, y que esta invitad@ a próximos encuentros para volver a practicar las técnicas.
• El certificado se entregará al finalizar la capacitación, luego de presentar las correspondientes actividades y aprobarlas.
• Para recibirlo deberá completar esta Planilla de Pago de Certificado (opcional, solo si quiere recibir el certificado) ➤$pc
  En la planilla se le solicitarán datos para confeccionar el certificado, el comprobante de pago y una casilla de mail para que se lo envíe. Tambien aparecerá este enlace para abonarlo $enMp
Se puede abonar con débito, credito, efectivo transferencia bancaria o transferencia desde cuenta de mercado pago
Puede abonar el Certificado antes, durante o al finalizar la cursada.

IMPORTANTE
 • Son certificados emitidos por una asociación civil
 • NO suman puntaje docente

HERRAMIENTAS DE ENSEÑANZA 
 • Clase virtual en donde se practicaran las tecnicas de manera intensiva
 • Grupo de WhatsApp para difusion directa de novedades
 • Asistencia docente directamente por mensajes de WhatsApp para facilitar la comunicacion
 • En el Classroom de su curso encontrará 
      • Un Video integrador
      • Pdf con imagenes que se vieron durante la cursada
      • Imagenes del protocolo de la tecnica para imprimirlo y pegarlo en la heladera, cartera billetera etc.
      • Grabación del encuentro virtual, sea el caso de que no pudo asistir.
 
CLASE VIRTUAL
$eM (se comunicara el enlace de unión en el grupo de WhatsApp) 

Te esperamos saludos! ❤
$f"""



/////boton variable, de uso unico
                "btnN" -> {
                    th1.text =

                        """Todo el material está en la pestaña de "Trabajos" (en celu) o "Trabajo en clase" (si estan en una compu).
Recuerden unirse al grupo de WhatsApp $w"""
                    /*editor.putString("txYc", "${etE.text.toString()}")
                            editor . apply ()*/
                }
                "btnDgw" -> th1.text = //var DescripcionGrupoWhatsApp =
                    """${i("DescripcionGrupoWhatsApp")}Recuerde unirse al Classroom
$c
Puede tambien tocar "Unirse a clase" y pegar este codigo
$cc

Planilla de Pago (opcional, solo si desea el certificado)
$pc

Enlace al encuentro del $em meet.google.com/ebb-yohi-aba

*¿Que hacemos luego de inscribirnos, ingresar al Classroom y sumarnos a este grupo de WhatsApp?*
   · Asistir a la charla del Lunes
   · Ver un video
   · Entregar una actividad
$f"""

                "btnCqh" -> th1.text = //var queHagoAhora =
                    """En principio debe que asistir a la clase del $em. Si no pueden asistir deberán ver la grabación. Mientras tanto recuerde unirse el grupo de WhatsApp $w
Luego debe ver el Video Integrador (pueden verlo antes también)
Por último deberán realizar las actividades que consisten en subir algunos videos de su autoría, se los voy a corregir uno por uno.
Luego de que sean corregidos con éxitos sus videos, si abonan (o abonaron) el Certificado les llegará por mail en menos de 24 hs. 

De forma más detallada sería así
1) Asisto a la charla del $em, si no puedo, veo la grabación. 8hs después de la charla estará disponible la grabación en este mismo Classroom
2) Veo el video integrador.
3) Completo las actividades (es subir algunos videos mostrando como hacen Rcp y Heimlich)
4) Cuando termino de subirlos MARCO LA TAREA COMO COMPLETADA (abajo dejo un video para el que no sepa como hacerlo)
5) En un plazo de 24hs le llegará su certificado firmado digitalmente a una casilla de correo (si abona o abonó el certificado) IMPORTANTE: el certificado puede abonarse en cualquier momento de la cursada. Luego de terminar se le pedirá que Ratifique sus datos.

Cualquier duda comentenme.
Saludos 😀"""

///////////////////////////
            }
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip: ClipData = ClipData.newPlainText("nombreDelMensaje", th1.text)
            clipboard.setPrimaryClip(clip)
            toast("copiado (" + id.text.toString() + ")")

        }
    }


    fun todoMinuscula(t: String): String {
        var array = arrayListOf<String>()
        var a = ""
        var b = ""
        var s = 0
        for (x in t) array.add(x.toString())//carga el texto al array
        for (x in array) //cambia el artext
        {
            array[s] = x.toLowerCase()
            s++
        }


        for (x in array) //carga el array al string
        {
            a = x.toString()
            b = b + a
        }
        return (b)
    }


    fun todoMayuscula(t: String): String {
        var array = arrayListOf<String>()
        var a = ""
        var b = ""
        var s = 0
        for (x in t) array.add(x.toString())//carga el texto al array
        for (x in array) //cambia el artext
        {
            array[s] = x.toUpperCase()
            s++
        }


        for (x in array) //carga el array al string
        {
            a = x.toString()
            b = b + a
        }
        return (b)

    }


    fun empiezaMayuscula(t: String): String {
        var b = ""
        if (t != "") {
            var array = arrayListOf<String>()
            var a = ""

            var s = 0
            for (x in t) array.add(x.toString())//carga el texto al array

            //    if (array.count()!=0)
            //      {
            array[0] = array[0].toUpperCase()
//        }

            for (x in array) //carga el array al string
            {
                a = x.toString()
                b = b + a
            }
        }
        return (b)

    }


    fun i(texto: String): String  //titulo de inicio
    {
        var tx = ""
        return (tx)
    }


    fun toast(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
    }

    fun etListener(etId: EditText): String {//necesito solo el id y ya
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = prefs.edit()
        var etN =
            resources.getResourceEntryName(etId.id)//nombre del edit text, son todos iguales ahora

        etId.setText(
            prefs.getString(etN + selector, "NO CARGO").toString()
        )//carga en el et, junto con el selector, todo es el mismo et de base, entonces va a quedar etPf1/etPf2 etc,dependiendo cual toque, carga siempre en "1" en esta parte, esta es la parte -por defecto-
        var v =
            etId.text.toString() //iguala la variable al et que se puso, va a funcionar pada el "1" nada mas
        //porque por defecto es el "1". Podria en teoria entonces actualizar el uno directamente pero ya esta el codigo hecho.
        //Aparte seria escribir de mas


        //aca arranca la atualzacion//
        etId.addTextChangedListener {//actualiza el valor guardado y las variantes dependientes
            //cuando se toca cualquier et pasa esto, que varia segun el et tocado

            editor.putString(
                etN + selector, //
                "${etId.text}"
            ) //guarda el et, varia la clave variando el "selector"
            editor.apply()//lo aplica

            v = etId.text.toString()//iguala la variable al texto del edit text
            c("v:" + v)
            c("etN:" + etN)
            if(etN=="etE"){ //es para que actualize el titulo si se cambia el encuentro
                var paciente =
                    when (selector) {//dice si se marco bebe o adulto, para el textView es nada mas
                        "1" -> "Rcp Bebes "
                        "2" -> "Heimlich Bebes "
                        "3" -> "Rcp Adultos "
                        "4" -> "Heimlich Adultos "
                        else -> "NO ANDUVO"
                    }
                tituloInputs.text = paciente + prefs.getString("etE$selector", "NO CARGO")?.let {
                    empiezaMayuscula(
                        it
                    )
                }} //solo para ctualiar el textview mientras se actualiza el encuentro
            when (etN + selector) {//dependiendo el selector+base cambia en tiempo real la variable a usar

                //BEBES RCP!
                "etPf1" -> pf3 = v
                "etPi1" -> pi3 = v
                "etPc1" -> pc3 = v
                "etMeet1" -> meet3 = v
                "etRat1" -> rat3 = v

                "etE1" -> {
                    encuentro3 = v
                    //Encuentro en mayuscula
                    eM3 = todoMayuscula(encuentro3.toString())
                    //Encuentro en minuscula
                    em3 = todoMinuscula(encuentro3.toString())
                    //Encuentro arranca en Mayuscula y sigue en minuscula
                    eMm3 = empiezaMayuscula(encuentro3.toString())
                    //actualiza las variables hijas
                    //cuando haga el llamado por defecto le paso v a encuentro y abajo dejo esto para no ponerlo aca
                    //porque es codifo de USO UNICO!!
                }

                "etD1" -> d3 = v
                "etC1" -> c3 = v
                "etCc1" -> cc3 = v
                "etW1" -> w3 = v
                "etCosto1" -> costo3 = v
                "etEnMp1" -> enMp3 = v
                "etH1" -> h3 = v


                //////BEBES HEIMLICH
                "etPf2" -> pf4 = v
                "etPi2" -> pi4 = v
                "etPc2" -> pc4 = v
                "etMeet2" -> meet4 = v
                "etRat2" -> rat4 = v

                "etE2" -> {
                    encuentro4 = v
                    //Encuentro en mayuscula
                    eM4 = todoMayuscula(encuentro4.toString())
                    //Encuentro en minuscula
                    em4 = todoMinuscula(encuentro4.toString())
                    //Encuentro arranca en Mayuscula y sigue en minuscula
                    eMm4 = empiezaMayuscula(encuentro4.toString())
                    //actualiza las variables hijas
                    //cuando haga el llamado por defecto le paso v a encuentro y abajo dejo esto para no ponerlo aca
                    //porque es codifo de USO UNICO!!
                }

                "etD2" -> d4 = v
                "etC2" -> c4 = v
                "etCc2" -> cc4 = v
                "etW2" -> w4 = v
                "etCosto2" -> costo4 = v
                "etEnMp2" -> enMp4 = v
                "etH2" -> h4 = v


            }


        }
        return (v)//retorno v para que a la primera pasada se use el valor que se muestra en pantalla
    }

    fun c(t: String) {
        t.toString()
        println(t)
    }


}