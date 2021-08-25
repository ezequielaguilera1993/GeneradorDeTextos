package com.example.generadordetextosBohem

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    //////////////////////
    /**HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/
    /**HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/
    /**HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/
    /**HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA*/
    /**HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
     *
     *
     * git remote add origin https://github.com/ezequielaguilera1993/GeneradorDeTextos.git
    git branch -M main
     *
     *
     * */
    ///wslttgpohhha sasd
    var selector = "1" //por defecto esta configurado en bebes

    //variables fijas
    var f = ""

    //variables
    var pf: String? = null //enl pub facebook

    //fijas, en button toman valor segun que button se toque, mas especificamente segun con que numero termina el button
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

    /////////////////////////////bebes rcp
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

    /////////////////////adultos heimlich
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(Random(10).nextInt(10))

        inputs.setOnClickListener {
            val i = Intent(this, Inputs::class.java)
            startActivity(i)
        }
//Textos fijos
        button(btnMpf)
        button(btnFsC)
        button(btnFsW)
        button(btnMpw)
        button(btnCn)
        button(btnPr)
        button(btnVc)
        button(btnYc)

//textos multiples
        button(btnWqh1)
        button(btnUr1)
        button(btnHe1)
        button(btnA1)

        button(btnWqh2)
        button(btnUr2)
        button(btnHe2)
        button(btnA2)

        button(btnWqh3)
        button(btnUr3)
        button(btnHe3)
        button(btnA3)

        button(btnWqh4)
        button(btnUr4)
        button(btnHe4)
        button(btnA4)

        button(btnWqh5)
        button(btnUr5)
        button(btnHe5)
        button(btnA5)

        btnCodigo(btnCod1)
        btnCodigo(btnCod2)
        btnCodigo(btnCod3)
        btnCodigo(btnCod4)
        btnCodigo(btnCod5)


    }

    override fun onResume() {//cuando pasa por el onResume actualiza los textView y las variables
        super.onResume()
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        titulo1.text = "Rcp Bebés " + prefs.getString("etE1", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        }
        titulo2.text = "Heimlich Bebés " + prefs.getString("etE2", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        }
        titulo3.text = "Rcp Adultos " + prefs.getString("etE3", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        }
        titulo4.text = "Heimlich Adultos " + prefs.getString("etE4", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        }

        titulo5.text = "ACV/INFARTO " + prefs.getString("etE5", "NO CARGO")?.let {
            empiezaMayuscula(
                it
            )
        }



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

        ///////////////////////////////////

        pf2 = prefs.getString("etPf2", "")
        enMp2 = prefs.getString("etEnMp2", "")
        pi2 = prefs.getString("etPi2", "")
        pc2 = prefs.getString("etPc2", "")
        costo2 = prefs.getString("etCosto2", "")
        encuentro2 = prefs.getString("etE2", "")
        eM2 = todoMayuscula(encuentro2.toString())
        //Encuentro en minuscula
        em2 = todoMinuscula(encuentro2.toString())
        //Encuentro arranca en Mayuscula y sigue en minuscula
        eMm2 = empiezaMayuscula(encuentro2.toString())
        d2 = prefs.getString("etD2", "")
        c2 = prefs.getString("etC2", "")
        cc2 = prefs.getString("etCc2", "")
        w2 = prefs.getString("etW2", "")
        meet2 = prefs.getString("etMeet2", "")
        rat2 = prefs.getString("etRat2", "")
        h2 = prefs.getString("etH2", "")

        ///////////////////////////////////

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

        ///////////////////////////////////

        pf5 = prefs.getString("etPf5", "")
        enMp5 = prefs.getString("etEnMp5", "")
        pi5 = prefs.getString("etPi5", "")
        pc5 = prefs.getString("etPc5", "")
        costo5 = prefs.getString("etCosto5", "")
        encuentro5 = prefs.getString("etE5", "")
        d5 = prefs.getString("etD5", "")
        c5 = prefs.getString("etC5", "")
        cc5 = prefs.getString("etCc5", "")
        w5 = prefs.getString("etW5", "")
        meet5 = prefs.getString("etMeet5", "")
        rat5 = prefs.getString("etRat5", "")
        h5 = prefs.getString("etH5", "")
        eM5 = todoMayuscula(encuentro5.toString())
//Encuentro en minuscula
        em5 = todoMinuscula(encuentro5.toString())
//Encuentro arranca en Mayuscula y sigue en minuscula
        eMm5 = empiezaMayuscula(encuentro5.toString())

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


            when (id.hint) {//botones fijos
                "btnPr" -> th1.text = //var PagoRapido =
                    """${i("PagoRapido")}*Enlace de pago de los cursos* 
• Un (1) Certificado $costo1$ $enMp1
• Dos (2) Certificados $costo2$ (${(costo2!!.toInt()/2)} cada certificado) $enMp2
• Tres (3) Certificados $costo3$ (${(costo3!!.toInt()/3)} cada certificado) $enMp3
• Cuatro (4) Certificados $costo4$ (${(costo4!!.toInt()/4)} cada certificado) $enMp4
Se puede abonar con efectivo desde un Rapipago o Pago Fácil, también con débito, crédito, transferencia bancaria o transferencia desde cuenta de mercado pago

$f"""


                "btnMpf" -> th1.text =  //var MensajePrivadoFacebook =
                    """${i("MensajePrivadoWhatsApp")}Información sobre las capacitaciónes en Primeros Auxilios
                        
¿COMO ME INSCRIBO?
• Acceda a nuestra pagina web https://sites.google.com/view/bohemcapacitaciones/ , desplace la pagina hacia abajo y pulse en "Quiero inscribirme"

CONTENIDOS
 • Clase virtual en donde practicaremos las técnicas de manera intensiva
 • Grupos de WhatsApp para difusión directa de novedades
 • Asistencia docente directamente por mensajes de WhatsApp, facilitando la comunicación
 • En el Classroom de su curso encontrará 
      • Video introductorio a la fisiología humana (para entender bien los temas)
      • Video con aspectos teoricos y prácticos de la técnica a aprender.
      • Pdf con imágenes que se vieron durante la cursada.
      • Protocolos de las técnicas para imprimirlo y pegarlo en la heladera, cartera billetera etc.
      • Grabación del encuentro virtual (para l@s que no puedan asistir).
      • Una actividad que deberá realizar para aprobar la cursada.

CLASES VIRTUALES (quedan grabadas para las personas que no puedan asistir)
Rcp BEBÉS: $eMm1 (el enlace al Meet se comunicará en el grupo de WhatsApp)
Heimlich BEBÉS: $eMm2 (el enlace al Meet se comunicará en el grupo de WhatsApp)
Rcp ADULTOS: $eMm3 (el enlace al Meet se comunicará en el grupo de WhatsApp)
Heimlich ADULTOS: $eMm4 (el enlace al Meet se comunicará en el grupo de WhatsApp)

Para completar con éxito las capacitaciónes, además de asistir al encuentro deberá ver un video integrador y realizar actividades en un Classroom, imprescindibles para terminar de aprender los temas. Cada curso tiene un grupo de WhatsApp y un Classroom diferente

¿Que hacemos luego de inscribirnos, de ingresar al Classroom y al grupo de WhatsApp de cada curso?
Más que nada deberá asistir a la charla virtual, ver un video y entregar una actividad, si entregan antes la actividad antes se entrega el certificado
Un poco más detallado
1) Asistir al encuentro (o en su defecto ver la grabación). 
2) Acceder al Classroom y ver videos que profundizan conceptos
3) Presentar una actividad. 
4) Marcar la tarea como completada
5) (opcional) Si abonaron el certificado les estará llegando por mail en menos de 24hs

Dudas principales
1) ¿Por qué se cobran los certificados? se cobra para hacer el curso redituable, sin dejar de capacitar a nadie.
2) ¿Como abono el certificado? En esta planilla se le proporcionara un link de pago, se le solicitaran datos para confeccionar los certificados y una captura del comprobante de pago. $pc Desde esta misma planilla puede solicitar todos los certificados
3) ¿Cómo comparto este curso con otra persona? puede enviarle este enlace a la Planilla de Ingreso $pi
4) ¿Cuánto dura el curso? Dura 2 semanas, pero si entregan antes las actividades, antes se entregará el certificado. Tendran una clase intensiva y dos semanas para estudiar un video integrador y realizar actividades.
5) Encontrará más información y preguntas frecuentes en este documento https://docs.google.com/document/d/1B0zBFx6WdD97CwP8WXIpVt0fDRz5LDDJ69HzzrF8XK0/edit?usp=sharing . 

Te esperamos saludos! ❤
$f"""


                "btnMpw" -> th1.text = //var MensajePrivadoWhatsApp =
                    """${i("MensajePrivadoWhatsApp")}*Información sobre las capacitaciónes en Primeros Auxilios*
*¿Cómo me inscribo?*
• Acceda a nuestra pagina web https://sites.google.com/view/bohemcapacitaciones/ y pulse en "Quiero inscribirme"


*Certificación*
• Si bien las capacitaciónes son totalmente gratuitas, se entregarán certificados *(OPCIONALES)* firmados digitalmente abonando la suma de $costo$ por cada curso realizado, con el fin de volverlas redituables, sin dejar a nadie sin capacitar (todos los certificados poseen el mismo costo) *Puede realizar las capacitaciónes sin abonarlos, es totalmente opcional. Solo lo abonan las personas que quieran recibirlos*.
Luego de finalizar las capacitaciónes que haya elegido (al aprobar las actividades), se hará entrega de los certificado en menos de 24hs. Se entrega un certificado diferente por cada curso
Para recibirlos deberá completar esta Planilla de Pago de Certificados ➤$pc

*Importante*
 • Son certificados emitidos por una asociación civil
 • NO suman puntaje docente
 • Poseen un código único de autenticidad
 • Son enviados por mail con calidad de impresión. Recomendamos imprimirlo a color y en papel fotográfico

*Contenidos*
 • Clase virtual en donde practicaremos las técnicas de manera intensiva
 • Grupos de WhatsApp para difusión directa de novedades
 • Asistencia docente directamente por mensajes de WhatsApp, facilitando la comunicación
 • En el Classroom de su curso encontrará 
      • Video introductorio a la fisiología humana (para entender bien los temas)
      • Video con aspectos teoricos y prácticos de la técnica a aprender.
      • Pdf con imágenes que se vieron durante la cursada.
      • Protocolos de las técnicas para imprimirlo y pegarlo en la heladera, cartera billetera etc.
      • Grabación del encuentro virtual (para l@s que no puedan asistir).
      • Una actividad que deberá realizar para aprobar la cursada.

*Clases virtuales (si no puede asistir podrá ver la grabación y continuar con el curso)*
*Rcp BEBÉS:* $eMm1 (el enlace al Meet se comunicará en el grupo de WhatsApp)
*Heimlich BEBÉS:* $eMm2 (el enlace al Meet se comunicará en el grupo de WhatsApp)
*Rcp ADULTOS:* $eMm3 (el enlace al Meet se comunicará en el grupo de WhatsApp)
*Heimlich ADULTOS:* $eMm4 (el enlace al Meet se comunicará en el grupo de WhatsApp)

Para completar con éxito las capacitaciónes, además de asistir al encuentro deberá ver un video integrador y realizar actividades en un Classroom, imprescindibles para terminar de aprender los temas. *Cada curso tiene un grupo de WhatsApp y un Classroom diferente*


*¿Que hacemos luego de inscribirnos, de ingresar al Classroom y al grupo de WhatsApp de cada curso?*
Más que nada deberá asistir a la charla virtual, ver un video y entregar una actividad, si entregan *antes* la actividad *antes* se entrega el certificado
Un poco más detallado
*1)* Asistir al encuentro (o en su defecto ver la grabación). 
*2)* Acceder al Classroom y ver un video que integra y profundiza conceptos
*3)* Presentar una actividad. 
*4)* Marcar la tarea como completada
*5)* (opcional)* Si abonaron el certificado les estará llegando por mail en menos de 24hs

*Dudas principales*
*1)* ¿Por qué se cobran los certificados? se cobra para hacer el curso redituable, sin dejar de capacitar a nadie.
*2)* ¿Como abono el certificado? En esta planilla se le proporcionara un link de pago, se le solicitaran datos para confeccionar los certificados y una captura del comprobante de pago. $pc *Desde esta misma planilla puede solicitar todos los certificados*
*3)* ¿Cómo comparto este curso con otra persona? puede enviarle este enlace a la Planilla de Ingreso $pi
*4)* ¿Cuánto dura el curso? Dura 2 semanas, pero si entregan antes las actividades, antes se entregará el certificado. Tendrán una clase intensiva y dos semanas para estudiar un video integrador y realizar actividades.
*5)* Encontrará más información y preguntas frecuentes en este documento https://docs.google.com/document/d/1B0zBFx6WdD97CwP8WXIpVt0fDRz5LDDJ69HzzrF8XK0/edit?usp=sharing . 

*PUBLICACION ORIGINAL*
$pf

Te esperamos saludos! ❤
$f"""
                "btnVc" -> th1.text =
                    """*📝Estoy por corregir sus entregas*
Salvo viernes y sábados corrijo todos días de las dos semanas que dura el curso. Recuerden marcar la actividad como completada para que me aparezca en el Classroom.
                        
*IMPORTANTE:* si envian los ejercicios a mi WhatsApp (porque no les carga cuando intentan subirlos al Classroom) deben realizar estos tres pasos extra
      • Enviar por mensaje de WhatsApp su nombre y apellido (tal cual como lo pusieron en el Classroom)
      • Enviar por mensaje de WhatsApp el curso o cursos para los cuales entregan la actividadvideos
            *Ejemplo: "Ezequiel Aguilera. Heimlich bebés 12/02"*
      • Y por último marcar la actividad como completada en el Classroom *(asi no hayan subido nada se debe marcar igual)*
      
*¿Por qué los pasos extras?*      
En el Classroom me aparece su nombre, pero no tengo como relacionarlos con su teléfono para buscarlos por WhatsApp. Y muchas veces tengo WhatsApp saturado de personas que preguntan por el curso, u otros compañeros que envian la actividad. Si ponen el nombre apellido y el curso o cursos para los cuales entregan la actividad, yo cuando veo que entregaron en el Classrooom busco su nombre con la lupita de WhatsApp y los encuentro. Si no realizan estos pasos no los voy a poder encontrar, o se va a ser mas dificil.
Cualquier duda comentenme"""

                "btnCn" -> th1.text =  //var MensajeCorrecion =
                    """${i("")} Hola! Hay cosas a corregir. Por lo general las personas entregan 2 o 3 veces hasta aprobar. 
No debe entregar todo de vuelta, solo videos cortos con las cosas marcadas a corregir.
Si tiene un ✔ quiere decir que está bien. 
Si tiene una ❌  quiere decir que hace falta enviar un vídeo corto con las correcciones marcadas
• Diagnostico de paro cardíaco y llamado a emergencias: ❌✔
• Técnica de Rcp: ❌✔
• Atragantamiento leve: ❌✔ 
• Atragantamiento grave: ❌✔ 

Recordá marcar de vuelta la actividad como completada cuando envíes las correciones, independientemente si las subis al Classroom o las envias por WhatsApp

Consejos:
Si cuando estas haciendo algun video te surje alguna duda comentame
$f"""


                "btnFsW" -> th1.text =//var MensajeFelicitacionesWhatsApp =
                    """${i("MensajePrivadoFacebookYAPASO")}Felicitaciones completaste el curso con éxito🥳
Espero que lo hayas disfrutado y que hayas aprendido mucho. Recordá que podes volver a participar las veces que quieras de forma gratuita para reforzar las técnicas. 
*¿Qué es el código de aprobación?*
*Es un código único generado por cada participante, es personal intransferible y de un solo uso. Lo encontrará mas abajo y separado para facilitar su copiado y pegado*

*IMPORTANTE: ¿COMO SOLICITAR EL CERTIFICADO?*
*• Si ya abonó el certificado*
Si ya abonó el certificado debe completar la planilla de Solicitud del Certificado comunicando su *código único* y su *comprobante*➤ $rat
Luego de completarla, en menos de 24hs le estará llegando a su casilla de mail el certificado firmado digitalmente y en calidad de impresión. (si perdiste el comprobante comentame, no pasa nada)

*• Sea el caso que NO haya abonado el certificado pero desee hacerlo en este momento*
Si todavía NO abonó el certificado pero desea abonarlo y solicitarlo en este momento debe seguir estos dos pasos
    *1)* Abonar sus certificados accediendo a este enlace➤ https://docs.google.com/document/d/1TkoF6YhIE0h2YsFbAMsFCLhrmf7SPDerEbVJYak62g0/edit?usp=sharing 
    *2)* Completar la Planilla de Solicitud de Certificado comunicando su código único➤ $rat
    
*El código único lo encontrará escrito debajo, para que pueda copiarlo y pegarlo con mayor facilidad*
$f"""

                "btnFsC" -> th1.text =//var MensajeFelicitacionesClassroom =
                    """${i("MensajePrivadoFacebookYAPASO")}Felicitaciones completaste el curso con éxito🥳
Espero que lo hayas disfrutado y que hayas aprendido mucho. Recordá que podes volver a participar las veces que quieras de forma gratuita para reforzar las técnicas. 
¿Qué es el código de aprobación?
Es un código único generado por cada participante, es personal intransferible y de un solo uso. Lo encontrará mas abajo y separado para facilitar su copiado y pegado

IMPORTANTE: ¿COMO SOLICITAR EL CERTIFICADO?
• Si ya abonó el certificado
Si ya abonó el certificado debe completar la planilla de Solicitud del Certificado comunicando su código único y su comprobante➤ $rat
Luego de completarla, en menos de 24hs le estará llegando a su casilla de mail el certificado firmado digitalmente y en calidad de impresión. (si perdiste el comprobante comentame, no pasa nada)

• Sea el caso que NO haya abonado el certificado pero desee hacerlo en este momento
Si todavía NO abonó el certificado pero desea abonarlo y solicitarlo en este momento debe seguir estos dos pasos
    1) Abonar sus certificados accediendo a este enlace➤ https://docs.google.com/document/d/1TkoF6YhIE0h2YsFbAMsFCLhrmf7SPDerEbVJYak62g0/edit?usp=sharing 
    2) Completar la Planilla de Solicitud de Certificado comunicando su código único➤ $rat
    
El código único lo encontrará escrito debajo, para que pueda copiarlo y pegarlo con mayor facilidad

$f"""


                "btnYc" -> {
                    th1.text =
                        """📑Terminé de corregir lo que enviaron, mañana vuelvo a hacerlo (recuerden que tienen dos semanas para entregar todo). Si nos les llegó la corrección o el certificado avísenme asi lo solucionamos."""


                }


//botones variables
                ////////////Boton variable, y de uso frecuente////////////
                "btnWqh" -> th1.text =
                    """${i("")}*IMPORTANTE* Si no sabe como usar Classroom comenteme asi le envío un videotutorial
*¿Que hacemos luego de inscribirnos, luego de ingresar al Classroom y unirnos a este grupo de WhatsApp?*
Más que nada es *asistir a la charla del $d, ver un video y entregar una actividad, si entregan antes la actividad antes se entrega el certificado*

*Un poco más detallado*
*1)* Asistir al encuentro del *$em* (o en su defecto ver la grabación)  *conseguir un muñeco almohadon o frazada enrollada para practicar*. 
*2)* Acceder al Classroom y ver videos que integran y profundizan conceptos (puede verlos antes)
*3)* Presentar una actividad. 
*4)* Marcar la tarea como completada
*5) (opcional)* Si abonaron el certificado les estará llegando firmado digitalmente y en calidad de impresión a su casilla de mail en menos de 24hs
PUEDE REALIZAR LA CAPACITACIÓN SIN ABONAR EL CERTIFICADO, ES TOTALMENTE OPCIONAL. LO ABONAN SOLO LAS PERSONAS QUE LO PRECISAN.

*De forma bien detallada*
*1)* Esperar a la charla del *$em*. Este es el enlace al Classroom por si todavía no se unieron $c
En algunos celulares puede no funcionar, en ese caso toque "Unirse a clase" y pegue el código siguiente
$cc
*Enlace de union a la clase virtual* ${meet}. Sea el caso que no puedas asistir a la charla podés ver la grabación (la voy a subir al Classroom). *Importante: buscar antes del encuentro del $d un muñeco, almohadón o frazada enrollada para practicar. El 95% del curso es práctica*

*LUEGO del encuentro del $em, deberán acceder al Classroom y...*
*2)* Ver los video complementarios, que profundizan conceptos ya vistos (puede verlos antes de la charla)
*3)* Realizar la actividad, que consiste en subir algunos videos de su autoría.
*4)* IMPORTANTE: cuando terminen las actividades deberán marcar la tarea como completada. 
*5) (Opcional)* Si abonaron el certificado les estará llegando firmado digitalmente, en calidad de impresión y con código de autenticidad a su casilla de mail en menos de 24hs.   

*Página del Instituto Progreso Salud*
https://www.facebook.com/institutoprogresosalud

*Página web de Bohem Capacitaciones*
https://sites.google.com/view/bohemcapacitaciones/


*Publicacion de Facebook*
$pf

Cualquier duda comentame.
$f"""

                "btnUr" -> th1.text = //var UnionRapida =
                    """${i("UnionRapida")}ENLACES PARA UNIRSE A LOS CURSOS (puede unirse a todos)

 *CURSO RCP EN BEBÉS*
• Enlace de unión al grupo de WhatsApp: $w1
• Enlace de unión al Classroom: $c1
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc1

 *CURSO MANIOBRA DE HEIMLICH EN BEBÉS*
• Enlace de unión al grupo de WhatsApp: $w2
• Enlace de unión al Classroom: $c2
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc2

 *CURSO RCP EN ADULTOS*
• Enlace de unión al grupo de WhatsApp: $w3
• Enlace de unión al Classroom: $c3
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc3

 *CURSO MANIOBRA HEIMLICH EN ADULTOS*
• Enlace de unión al grupo de WhatsApp: $w4
• Enlace de unión al Classroom: $c4
(debe unirse a los dos)
Sea el caso que no puede unirse toque "unirse a una clase", luego copie y pegue este código
$cc4
$f"""

                "btnHe" ->
                    th1.text = //var HoyEsElEncuentro =
                        """${i("HoyEsElEncuentro")}📺Arrancamos el encuentro hoy $em
Enlace para sumarse por meet $h: $meet 

Pueden descargarse el app de Google Meet si quieren, les dejo el enlace https://play.google.com/store/apps/details?id=com.google.android.apps.meetings *(NO ES NECESARIA ESTE APP PUEDEN ACCEDER DIRECTAMENTE DESDE EL NAVEGADOR)*

*IMPORTANTE:* recuerden conseguirse un muñeco, un peluche, almohada o frazada enrollada para practicar. Les recomiendo prepararse para prender la cámara y mostrarse haciendo las técnicas, les va a facilitar mucho hacer la actividad ya que voy a poder indicar errores en vivo

*GRABACIÓN DEL ENCUENTRO*
Va a estar el mismo Classroom hoy a la noche, a mas tardar mañana a la mañana

*CLASSROOM*
$c
En algunos celulares puede no funcionar, en ese caso toque "Unirse a clase" y pegue el código siguiente
$cc
$f}"""

                "btnA" -> th1.text =//arranca en una hora
                    """${i("HoyEsElEncuentro")}📺Arrancamos el encuentro $h
Enlace para sumarse por meet: $meet 

*IMPORTANTE:* recuerden conseguirse un muñeco, un peluche, almohada o frazada enrollada para practicar. Les recomiendo prepararse para prender la cámara y mostrarse haciendo las técnicas, les va a facilitar mucho hacer la actividad ya que voy a poder indicar errores en vivo
"""


            }
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip: ClipData = ClipData.newPlainText("nombreDelMensaje", th1.text)
            clipboard.setPrimaryClip(clip)
            toast("~" + id.text.toString() + "~")

        }
    }

    fun i(texto: String): String  //titulo de inicio
    {
        var tx = ""
        return (tx)
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

    fun toast(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
    }

    fun btnCodigo(btnCodigo: Button) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = prefs.edit()
        btnCodigo.setOnClickListener {

            var num =
                random(btnCodigo)//trae un texto bidigital según que btnCod se toco, es la primera parte del código

            var num2 =
                random(btnCodigo)//trae OTRO texto bidigital según que btnCod se toco, es la primera parte del código

            var contador = 0//es el contador del codigo, es para no repetir nunca el codigo
            //(toma el valor que tenga el dato guardado segun el btnCod ingresado y le suma uno, luego lo actualiza

            var nbtn =
                resources.getResourceEntryName(btnCodigo.id)//recoje el nombre del boton de codigo (el id)
            var CClassroom = ""//codigo del classroom
            var Encuentro = ""//encuentro
            when (nbtn) {
                "btnCod1" -> {
                    contador = prefs.getInt(
                        nbtn,
                        0
                    )//iguala el contador a lo que este en prefs, a la primera lo iguala a 0

                    editor.putInt(
                        nbtn,
                        contador + 1
                    )//agrega al claveValor btnCod1234 un tanto PERO contador queda como estaba, SOLO SE ACTUALIZA SI SE TOCA EL BTN DE VUELTA!

                    CClassroom = "$cc1"
                    Encuentro =
                        espaciosPorGuiones(encuentro1!!)//lo que esta guardado en encuentor(lo que esta en etE) se rremplza espaciopor por guinoes y eso se iguala a "Encuentro"
                }
                "btnCod2" -> {
                    contador = prefs.getInt(nbtn, 0)
                    editor.putInt(nbtn, contador + 1)
                    CClassroom = "$cc2"
                    Encuentro = espaciosPorGuiones(encuentro2!!)
                }
                "btnCod3" -> {
                    contador = prefs.getInt(nbtn, 0)
                    editor.putInt(nbtn, contador + 1)
                    CClassroom = "$cc3"
                    Encuentro = espaciosPorGuiones(encuentro3!!)
                }
                "btnCod4" -> {
                    contador = prefs.getInt(nbtn, 0)
                    editor.putInt(nbtn, contador + 1)
                    CClassroom = "$cc4"
                    Encuentro = espaciosPorGuiones(encuentro4!!)
                }

                "btnCod5" -> {
                    contador = prefs.getInt(nbtn, 0)
                    editor.putInt(nbtn, contador + 1)
                    CClassroom = "$cc5"
                    Encuentro = espaciosPorGuiones(encuentro5!!)
                }

            }

            editor.apply()//ACTUALIZA ACA el valor del btn

            var codigo =
                "Id.$num-$contador.$CClassroom"//junta el codigo y el contador

            th1.text = codigo//lo muestra en el th1

            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip: ClipData = ClipData.newPlainText("nombreDelMensaje", codigo)
            clipboard.setPrimaryClip(clip)
            toast("~" + btnCodigo.text.toString() + "~")
        }
        //listo?. llamar botones!.hacer listener!
    }

    fun random(btnCodigo: Button): String //genera un texto random de dos caracters digitos segun que btnCod se toque
    {


        var arrayNumerosPares = arrayListOf<Int>(0, 2, 4, 8)//numeros pares
        var arrayNumerosInPares = arrayListOf<Int>(1, 3, 5, 7)//numeros impares

        var rm = Random.nextInt(4)//genero un random
        var p1 = arrayNumerosPares[rm].toString()//genero un numero par random

        rm = Random.nextInt(4)//genero el numeor random de vuelta
        var p2 = arrayNumerosPares[rm].toString()//genero otro numero par random

        rm = Random.nextInt(4)//genero el numeor random de vuelta
        var i1 = arrayNumerosInPares[rm].toString()//genero un numero INpar random

        rm = Random.nextInt(4)//genero el numeor random de vuelta
        var i2 = arrayNumerosInPares[rm].toString()//genero otro numero INpar random


        //ahora tengo dos numeros random pares, y dos numeros random inpares para usarlos (minimo mas procesamiento en pos de simplificacion de codigo)

        var nbtn =
            resources.getResourceEntryName(btnCodigo.id)//recoje el nombre del boton de codigo (el id)
        var stringReturn = ""
        when (nbtn) {
            "btnCod1" -> stringReturn =
                "A$p1$p2" //estos 4 generan un texto random de dos caracteres rb pp. hb pi. ra ip. ha ii
            "btnCod2" -> stringReturn = "A$p1$i1"
            "btnCod3" -> stringReturn = "A$i1$p1"
            "btnCod4" -> stringReturn = "A$i1$i2"
            "btnCod5" -> stringReturn = "B$p1$p2"


        }

        return (stringReturn)

    }

    fun espaciosPorGuiones(texto: String): String {
        var ar = arrayListOf<String>()

        for (x in texto) {
            ar.add(x.toString())
        }
        var s = 0
        for (x in ar) {

            when (x) {
                " " -> ar[s] = "."
                "/" -> ar[s] = "."

            }

            s++
        }

        var a = ""
        var b = ""

        for (x in ar) {

            a = x.toString()
            b = b + a

        }

        var texto = b
        return (texto)
    }


    fun String.dividir(dividendo:Int):String{
        return ((this.toInt()/dividendo).toString())
    }

}

