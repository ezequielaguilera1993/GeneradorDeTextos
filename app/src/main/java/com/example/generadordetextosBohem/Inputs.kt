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
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.th1

class Inputs : AppCompatActivity() {
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


    ////////BEBES, las variables de uso en botones unicos las saco de bebes, es para abrir la puerta a que sea mas facil modificar las cosas, ponele en el futuro quiero usar diferetnes
    //planillas de inscripcion para cada curso, bueno ya lo tengo armado asi y listo
    var pf1: String? = null //enl pub facebook
    var pi1: String? = null
    var pc1: String? = null
    var meet1: String? = null
    var rat1: String? = null
    var encuentro1: String? = null
    var eM1: String? = null
    var em1: String? = null
    var eMm1: String? = null
    var d1: String? = null
    var c1: String? = null
    var cc1: String? = null
    var w1: String? = null
    var enMp1: String? = null
    var costo1: String? = null
    var h1: String? = null

    /////////////////////bebes heimlich
    var pf2: String? = null //enl pub facebook
    var pi2: String? = null
    var pc2: String? = null
    var meet2: String? = null
    var rat2: String? = null
    var encuentro2: String? = null
    var eM2: String? = null
    var em2: String? = null
    var eMm2: String? = null
    var d2: String? = null
    var c2: String? = null
    var cc2: String? = null
    var w2: String? = null
    var enMp2: String? = null
    var costo2: String? = null
    var h2: String? = null

    /////////////////////adultos rcp
    var pf3: String? = null
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

    /////////////////////adultos heimlich
    var pf4: String? = null
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

    ///////////////////// ACV/INFARTOS
    var pf5: String? = null
    var pi5: String? = null
    var pc5: String? = null
    var meet5: String? = null
    var rat5: String? = null
    var encuentro5: String? = null
    var eM5: String? = null
    var em5: String? = null
    var eMm5: String? = null
    var d5: String? = null
    var c5: String? = null
    var cc5: String? = null
    var w5: String? = null
    var enMp5: String? = null
    var costo5: String? = null
    var h5: String? = null


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
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputs)

        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = prefs.edit()

        s1.isChecked =
            true //por defecti el selector 1 es el que esta seleccionado, para dar indicacion visual


        tituloInputs.text = "Rcp Bebés " + prefs.getString("etE1", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        } //por defecto el text view es el de bebes



        probar.setOnClickListener {

            pf1 = prefs.getString("etPf1", "")
            enMp1 = prefs.getString("etEnMp1", "")
            pi1 = prefs.getString("etPi1", "")
            pc1 = prefs.getString("etPc1", "")
            costo1 = prefs.getString("etCosto1", "")
            encuentro1 = prefs.getString("etE1", "")
            d1 = prefs.getString("etD1", "")
            c1 = prefs.getString("etC1", "")
            cc1 = prefs.getString("etCc1", "")
            w1 = prefs.getString("etW1", "")
            meet1 = prefs.getString("etMeet1", "")
            rat1 = prefs.getString("etRat1", "")
            h1 = prefs.getString("etH1", "")
            eM1 = todoMayuscula(encuentro1.toString())
//Encuentro en minuscula
            em1 = todoMinuscula(encuentro1.toString())
//Encuentro arranca en Mayuscula y sigue en minuscula
            eMm1 = empiezaMayuscula(encuentro1.toString())
            ///////////////////////////////////

            pf2 = prefs.getString("etPf2", "")
            enMp2 = prefs.getString("etEnMp2", "")
            pi2 = prefs.getString("etPi2", "")
            pc2 = prefs.getString("etPc2", "")
            costo2 = prefs.getString("etCosto2", "")
            encuentro2 = prefs.getString("etE2", "")
            d2 = prefs.getString("etD2", "")
            c2 = prefs.getString("etC2", "")
            cc2 = prefs.getString("etCc2", "")
            w2 = prefs.getString("etW2", "")
            meet2 = prefs.getString("etMeet2", "")
            rat2 = prefs.getString("etRat2", "")
            h2 = prefs.getString("etH2", "")
            eM2 = todoMayuscula(encuentro2.toString())
            //Encuentro en minuscula
            em2 = todoMinuscula(encuentro2.toString())
            //Encuentro arranca en Mayuscula y sigue en minuscula
            eMm2 = empiezaMayuscula(encuentro2.toString())

     //////////////////////

            pf3 = prefs.getString("etPf3", "")
            enMp3 = prefs.getString("etEnMp3", "")
            pi3 = prefs.getString("etPi3", "")
            pc3 = prefs.getString("etPc3", "")
            costo3 = prefs.getString("etCosto3", "")
            encuentro3 = prefs.getString("etE3", "")
            d3 = prefs.getString("etD3", "")
            c3 = prefs.getString("etC3", "")
            cc3 = prefs.getString("etCc3", "")
            w3 = prefs.getString("etW3", "")
            meet3 = prefs.getString("etMeet3", "")
            rat3 = prefs.getString("etRat3", "")
            h3 = prefs.getString("etH3", "")
            eM3 = todoMayuscula(encuentro3.toString())
            //Encuentro en minuscula
            em3 = todoMinuscula(encuentro3.toString())
            //Encuentro arranca en Mayuscula y sigue en minuscula
            eMm3 = empiezaMayuscula(encuentro3.toString())

            ///////////////////////////////////

            pf4 = prefs.getString("etPf4", "")
            enMp4 = prefs.getString("etEnMp4", "")
            pi4 = prefs.getString("etPi4", "")
            pc4 = prefs.getString("etPc4", "")
            costo4 = prefs.getString("etCosto4", "")
            encuentro4 = prefs.getString("etE4", "")
            d4 = prefs.getString("etD4", "")
            c4 = prefs.getString("etC4", "")
            cc4 = prefs.getString("etCc4", "")
            w4 = prefs.getString("etW4", "")
            meet4 = prefs.getString("etMeet4", "")
            rat4 = prefs.getString("etRat4", "")
            h4 = prefs.getString("etH4", "")
            eM4 = todoMayuscula(encuentro4.toString())
//Encuentro en minuscula
            em4 = todoMinuscula(encuentro4.toString())
//Encuentro arranca en Mayuscula y sigue en minuscula
            eMm4 = empiezaMayuscula(encuentro4.toString())


            th1.text =
                "encuentro1: " + encuentro1 + "\n" + "d1: " + d1 + "\n" + "pi1: " + pi1 + "\n" + "pc1: " + pc1 + "\n" + "c1: " + c1 + "\n" + "cc1: " + cc1 + "\n" + "w1: " + w1 + "\n" + "enMp1 " + enMp1 + "\n" + "costo1 " + costo1 + "\n" + "pf1: " + pf1 + "\n" + "rat1: " + rat1 + "\n" + "meet1: " + meet1 + "\n" + "horario1: " + h1 + "\n" + em1 + eM1 + eMm1 + "\n\n" + "encuentro: " + encuentro2 + "\n" + "d: " + d2 + "\n" + "pi: " + pi2 + "\n" + "pc: " + pc2 + "\n" + "c: " + c2 + "\n" + "cc: " + cc2 + "\n" + "w: " + w2 + "\n" + "enMp " + enMp2 + "\n" + "costo " + costo2 + "\n" + "pf1: " + pf2 + "\n" + "rat: " + rat2 + "\n" + "meet: " + meet2 + "\n" + "horario: " + h2 + "\n" + em2 + eM2 + eMm2 + "\n\n" +"encuentro: " + encuentro3 + "\n" + "d: " + d3 + "\n" + "pi: " + pi3 + "\n" + "pc: " + pc3 + "\n" + "c: " + c3 + "\n" + "cc: " + cc3 + "\n" + "w: " + w3 + "\n" + "enMp " + enMp3 + "\n" + "costo " + costo3 + "\n" + "pf: " + pf3 + "\n" + "rat: " + rat3 + "\n" + "meet: " + meet3 + "\n" + "horario: " + h3 + "\n" + em3 + eM3 + eMm3 + "\n\n" + "encuentro: " + encuentro4 + "\n" + "d: " + d4 + "\n" + "pi: " + pi4 + "\n" + "pc: " + pc4 + "\n" + "c: " + c4 + "\n" + "cc: " + cc4 + "\n" + "w: " + w4 + "\n" + "enMp " + enMp4 + "\n" + "costo " + costo4 + "\n" + "pf: " + pf4 + "\n" + "rat: " + rat4 + "\n" + "meet: " + meet4 + "\n" + "horario: " + h4 + "\n" + em4 + eM4 + eMm4 + "\n\n"

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
//para que cargue por defecto el "1"
        pf1 = prefs.getString("etPf1", "")
        enMp1 = prefs.getString("etEnMp1", "")
        pi1 = prefs.getString("etPi1", "")
        pc1 = prefs.getString("etPc1", "")
        costo1 = prefs.getString("etCosto1", "")
        encuentro1 = prefs.getString("etE1", "")
        eM1 = todoMayuscula(encuentro1.toString())
        //Encuentro en minuscula
        em1 = todoMinuscula(encuentro1.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm1 = empiezaMayuscula(encuentro1.toString())
        d1 = prefs.getString("etD1", "")
        c1 = prefs.getString("etC1", "")
        cc1 = prefs.getString("etCc1", "")
        w1 = prefs.getString("etW1", "")
        meet1 = prefs.getString("etMeet1", "")
        rat1 = prefs.getString("etRat1", "")
        h1 = prefs.getString("etH1", "")


        //esto de abajo lo pongo porque solo se definia las subVariables en el listener, entonces por defecto no se usaban
        eM2 = todoMayuscula(encuentro2.toString())
        //Encuentro en minuscula
        em2 = todoMinuscula(encuentro2.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm2 = empiezaMayuscula(encuentro2.toString())

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

        button(btnDgw5)//Descripcion de whatsapp
        button(btnN5)//novedades
        button(btnCqh5)//Classroom que hago ahora


//lo pongo bien abajo para que agarre los datos de todo el código para usarlos
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

                R.id.s5 -> {
                    selector = "5"

                }

            }
            var paciente =
                when (selector) {//dice si se marco bebe o adulto, para el textView es nada mas
                    "1" -> "Rcp Bebes "
                    "2" -> "Heimlich Bebes "
                    "3" -> "Rcp Adultos "
                    "4" -> "Heimlich Adultos "
                    "5" -> "ACV/INFARTOS "
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
                    pf = pf2
                    pi = pi2
                    pc = pc2
                    meet = meet2
                    rat = rat2
                    encuentro = encuentro2
                    eM = eM2
                    em = em2
                    eMm = eMm2
                    d = d2
                    c = c2
                    cc = cc2
                    w = w2
                    enMp = enMp2
                    costo = costo2
                    h = h2

                }
                "3" -> {
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
                "4" -> {
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

                "5" -> {
                    pf = pf5
                    pi = pi5
                    pc = pc5
                    meet = meet5
                    rat = rat5
                    encuentro = encuentro5
                    eM = eM5
                    em = em5
                    eMm = eMm5
                    d = d5
                    c = c5
                    cc = cc5
                    w = w5
                    enMp = enMp5
                    costo = costo5
                    h = h5
                }

                else -> { //esto es nada mas para incluir a los botones unicos que terminan en letra. Toman el valor de "1" por lo pronto
                    pf = pf1
                    pi = pi1
                    pc = pc1
                    meet = meet1
                    rat = rat1
                    encuentro = encuentro1
                    eM = eM1
                    em = em1
                    eMm = eMm1
                    d = d1
                    c = c1
                    cc = cc1
                    w = w1
                    enMp = enMp1
                    costo = costo1
                    h = h1
                }


            }





            when (id.hint) {
////IMPORTANTE, POR LO PRONTO LOS BOTONES FIJOS SE ALIMENTAN DE INPUTS DIFERENTES, PERO QUE TENDRAN EL MISMO TEXTO
////POR SI MAS ADELANTE HAY QUE ESCALARLO, QUE TODOS LOS CURSOS TENGAN TODOS LOS INPUTS PARA AGREGAR
//boton fijo pormel momento, pero de uso seguido


////////boton fijo por el miumento, pero de uso unico/////
                "btnRpi" -> th1.text =//var RespuestaPlanillaDeInscripcion =
                    """Felicitaciones! Ya están cargadas sus respuestas y está en condiciones de realizar los cursos.

ENLACES PARA UNIRSE A LOS CURSOS (puede unirse a todos)
(Si cuando pulsa uno se cierra la pagina no se haga problema, en cada Classroom y Whatsapp aparecen de vuelta)

 CURSO RCP EN BEBÉS
• Enlace de unión al grupo de WhatsApp: $w1
• Enlace de unión al Classroom: $c1
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc1
• Día del encuentro virtual: $em1 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet

 CURSO MANIOBRA DE HEIMLICH EN BEBÉS
• Enlace de unión al grupo de WhatsApp: $w2
• Enlace de unión al Classroom: $c2
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc2
• Día del encuentro virtual: $em2 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet

 CURSO RCP EN ADULTOS
• Enlace de unión al grupo de WhatsApp: $w3
• Enlace de unión al Classroom: $c3
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc3
• Día del encuentro virtual: $em3 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet

 CURSO MANIOBRA HEIMLICH EN ADULTOS
• Enlace de unión al grupo de WhatsApp: $w4
• Enlace de unión al Classroom: $c4
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc4
• Día del encuentro virtual: $em4 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet

 CURSO PRIMEROS AUXILIOS ANTE ACV/INFARTOS
• Enlace de unión al grupo de WhatsApp: $w5
• Enlace de unión al Classroom: $c5
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc5
• Día del encuentro virtual: $em5 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet





 $f"""

                "btnPf" -> th1.text =//var Publicación Facebook =

                    """${i("Publicación en Facebook")}Capacitaciones GRATUITAS en Primeros Auxilios que se mantienen gracias al pago OPCIONAL de certificados
Pàgina web: https://sites.google.com/view/bohemcapacitaciones   
                     
INSCRIPCIÓN GRATUITA
• Acceda a los enlaces públicos de unión https://docs.google.com/document/d/1H8DsbU-qfeIijVni4zrfG_ND1ugv_gNHq2x8dvFyiQU/edit?usp=sharing

INSCRIPCIÓN CON CERTIFICADO
• Deberá abonar un precio mínimo dependiendo de la cantidad de certificados que solicite
• Luego de abonar súmese a los cursos a través de los enlaces públicos de unión https://docs.google.com/document/d/1H8DsbU-qfeIijVni4zrfG_ND1ugv_gNHq2x8dvFyiQU/edit?usp=sharing

PROMOCIÓN
• Un (1) Certificado $costo1$ ›$enMp1
• Dos (2) Certificados $costo2$ (${(costo2!!.toInt() / 2)} cada certificado) ›$enMp2
• Tres (3) Certificados $costo3$ (${(costo3!!.toInt() / 3)} cada certificado) ›$enMp3
• Cuatro (4) Certificados $costo4${'$'} (${(costo4!!.toInt() / 4)} cada certificado) ›$enMp4
• Cinco (5) Certificados $costo5${'$'} (${(costo5!!.toInt() / 5)} cada certificado) ›$enMp5
En total puede abonar hasta 5 certificados (porque son 5 cursos). Si abona menos de 5 certificados, deberá elegir en qué cursos utilizar el comprobante. 

CURSOS DICTADOS
 • RCP en Bebés (para asistir en caso de paro cardíaco)
 • Maniobra de Heimlich en Bebés (para asistir en caso de atragantamiento)
 • RCP en Adultos (para asistir en caso de paro cardíaco)
 • Maniobra de Heimlich en Adultos (para asistir en caso de atragantamiento)
 • Primeros Auxilios en caso de ACV/INFARTO (doble curso)
 
Te esperamos! ❤
$f"""


/////boton variable, de uso unico
                "btnN" -> {
                    th1.text =

                        """Todo el material del curso está en la pestaña de "Trabajo en clase"
                            
ENLACES PARA UNIRSE A TODOS LOS CURSOS
CURSO RCP EN BEBÉS
• Enlace de unión al grupo de WhatsApp: $w1
• Enlace de unión al Classroom: $c1
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc1

 CURSO MANIOBRA DE HEIMLICH EN BEBÉS
• Enlace de unión al grupo de WhatsApp: $w2
• Enlace de unión al Classroom: $c2
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc2

 CURSO RCP EN ADULTOS
• Enlace de unión al grupo de WhatsApp: $w3
• Enlace de unión al Classroom: $c3
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc3

 CURSO MANIOBRA HEIMLICH EN ADULTOS
• Enlace de unión al grupo de WhatsApp: $w4
• Enlace de unión al Classroom: $c4
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc4

 CURSO PRIMEROS AUXILIOS ANTE ACV/INFARTOS
• Enlace de unión al grupo de WhatsApp: $w5
• Enlace de unión al Classroom: $c5
Sea el caso que no pueda unirse al Classroom toque "unirse a una clase", luego copie y pegue este código
$cc5
• Día del encuentro virtual: $em5 (si no puede asistir tenga en cuenta que estará la grabación del encuentro a su disposición) 
• Enlace al encuentro $meet

"""

                }
                "btnDgw" -> th1.text = //var DescripcionGrupoWhatsApp =
                    """${i("Descripción GrupoWhatsApp")}*Recuerde unirse al Classroom*
$c

*Enlace para abonar certificados*
https://n9.cl/5y10

*Enlace al encuentro del $em* $meet

*¿Que hacemos luego de inscribirnos, ingresar al Classroom y sumarnos a este grupo de WhatsApp?*
   · Asistir a la charla del $d
   · Estudiar el material del Classroom
   · Entregar una actividad
   
*Enlaces a todos cursos https://syr.us/ydO*
$f"""


                "btnCqh" -> th1.text = //var queHagoAhora =
                    """En principio debe que asistir a la clase del $em. Si no pueden asistir deberán ver la grabación (estará en el Classroom). Mientras tanto recuerde unirse el grupo de WhatsApp $w
Luego debe estudiar el material en este Classroom, por último deberán realizar una actividad (si realizan la actividad en vivo solo tendrán que grabar un audio de 1 minuto para aprobar)

De forma más detallada sería así
1) Asisto a la charla del $em, si no puedo, veo la grabación. 12hs después de la charla estará disponible en este mismo Classroom
2) Estudio el material presentado en este Classroom. Tienen a su disposición los protocolos, imágenes y videos del encuentro y un video sobre fisiología humana básica (junto con un cupón para acceder de forma gratuita a un curso de fisiología humana)
3) Completo la actividad. Si realizaron las prácticas en vivo, solo deberán grabar un audio de un minuto, sino, además de este audio deberán filmarse realizando las técnicas y luego subir los videos a este Classroom.
4) Cuando termino de subir el material a la tarea MARCO LA TAREA COMO COMPLETADA (para que yo pueda ver la entrega y corregirlos)
5) Si abona o abonó el certificado, le llegará firmado digitalmente, en calidad de impresión y con un código de autenticidad a su casilla de correo en un plazo de 24hs.
     IMPORTANTE: el certificado puede abonarse en cualquier momento de la cursada, pero la promoción pre-inscripción dura hasta este lunes inclusive. Luego tendrá un extra de 100$, cualquiera sea la cantidad de certificados abonados.


Cualquier duda comentenme.
Saludos 😀"""

///////////////////////////
            }
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip: ClipData = ClipData.newPlainText("nombreDelMensaje", th1.text)
            clipboard.setPrimaryClip(clip)
            toast("~" + id.text.toString() + "~")

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
            if (etN == "etE") { //es para que actualize el titulo si se cambia el encuentro
                var paciente =
                    when (selector) {//dice si se marco bebe o adulto, para el textView es nada mas
                        "1" -> "Rcp Bebes "
                        "2" -> "Heimlich Bebes "
                        "3" -> "Rcp Adultos "
                        "4" -> "Heimlich Adultos "
                        "5" -> "ACV/INFARTO "
                        else -> "NO ANDUVO"
                    }
                tituloInputs.text = paciente + prefs.getString("etE$selector", "NO CARGO")?.let {
                    empiezaMayuscula(
                        it
                    )
                }
            } //solo para Actualiar el textview mientras se actualiza el encuentro
            when (etN + selector) {//dependiendo el selector+base cambia en tiempo real la variable a usar

                //BEBES RCP!
                "etPf1" -> pf1 = v
                "etPi1" -> pi1 = v
                "etPc1" -> pc1 = v
                "etMeet1" -> meet1 = v
                "etRat1" -> rat1 = v

                "etE1" -> {
                    encuentro1 = v
                    //Encuentro en mayuscula
                    eM1 = todoMayuscula(encuentro1.toString())
                    //Encuentro en minuscula
                    em1 = todoMinuscula(encuentro1.toString())
                    //Encuentro arranca en Mayuscula y sigue en minuscula
                    eMm1 = empiezaMayuscula(encuentro1.toString())
                    //actualiza las variables hijas
                    //cuando haga el llamado por defecto le paso v a encuentro y abajo dejo esto para no ponerlo aca
                    //porque es codifo de USO UNICO!!
                }

                "etD1" -> d1 = v
                "etC1" -> c1 = v
                "etCc1" -> cc1 = v
                "etW1" -> w1 = v
                "etCosto1" -> costo1 = v
                "etEnMp1" -> enMp1 = v
                "etH1" -> h1 = v


                //////BEBES HEIMLICH
                "etPf2" -> pf2 = v
                "etPi2" -> pi2 = v
                "etPc2" -> pc2 = v
                "etMeet2" -> meet2 = v
                "etRat2" -> rat2 = v

                "etE2" -> {
                    encuentro2 = v
                    //Encuentro en mayuscula
                    eM2 = todoMayuscula(encuentro2.toString())
                    //Encuentro en minuscula
                    em2 = todoMinuscula(encuentro2.toString())
                    //Encuentro arranca en Mayuscula y sigue en minuscula
                    eMm2 = empiezaMayuscula(encuentro2.toString())
                    //actualiza las variables hijas
                    //cuando haga el llamado por defecto le paso v a encuentro y abajo dejo esto para no ponerlo aca
                    //porque es codifo de USO UNICO!!
                }

                "etD2" -> d2 = v
                "etC2" -> c2 = v
                "etCc2" -> cc2 = v
                "etW2" -> w2 = v
                "etCosto2" -> costo2 = v
                "etEnMp2" -> enMp2 = v
                "etH2" -> h2 = v


                //////ADULTOS RCP
                "etPf3" -> pf3 = v
                "etPi3" -> pi3 = v
                "etPc3" -> pc3 = v
                "etMeet3" -> meet3 = v
                "etRat3" -> rat3 = v

                "etE3" -> {
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

                "etD3" -> d3 = v
                "etC3" -> c3 = v
                "etCc3" -> cc3 = v
                "etW3" -> w3 = v
                "etCosto3" -> costo3 = v
                "etEnMp3" -> enMp3 = v
                "etH3" -> h3 = v



                //////HEIMLICH RCP
                "etPf4" -> pf4 = v
                "etPi4" -> pi4 = v
                "etPc4" -> pc4 = v
                "etMeet4" -> meet4 = v
                "etRat4" -> rat4 = v

                "etE4" -> {
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

                "etD4" -> d4 = v
                "etC4" -> c4 = v
                "etCc4" -> cc4 = v
                "etW4" -> w4 = v
                "etCosto4" -> costo4 = v
                "etEnMp4" -> enMp4 = v
                "etH4" -> h4 = v


                //////ACV/INFARTO
                "etPf5" -> pf5 = v
                "etPi5" -> pi5 = v
                "etPc5" -> pc5 = v
                "etMeet5" -> meet5 = v
                "etRat5" -> rat5 = v

                "etE5" -> {
                    encuentro5 = v
                    //Encuentro en mayuscula
                    eM5 = todoMayuscula(encuentro5.toString())
                    //Encuentro en minuscula
                    em5 = todoMinuscula(encuentro5.toString())
                    //Encuentro arranca en Mayuscula y sigue en minuscula
                    eMm5 = empiezaMayuscula(encuentro5.toString())
                    //actualiza las variables hijas
                    //cuando haga el llamado por defecto le paso v a encuentro y abajo dejo esto para no ponerlo aca
                    //porque es codifo de USO UNICO!!
                }

                "etD5" -> d5 = v
                "etC5" -> c5 = v
                "etCc5" -> cc5 = v
                "etW5" -> w5 = v
                "etCosto5" -> costo5 = v
                "etEnMp5" -> enMp5 = v
                "etH5" -> h5 = v



            }


        }
        return (v)//retorno v para que a la primera pasada se use el valor que se muestra en pantalla
    }

    fun c(t: String) {
        t.toString()
        println(t)
    }


}