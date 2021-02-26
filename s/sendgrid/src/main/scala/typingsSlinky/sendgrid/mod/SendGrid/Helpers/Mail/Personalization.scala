package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sendgrid.anon.Cc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Personalization extends StObject {
  
  def addBcc(email: Email): Unit = js.native
  
  def addCc(email: Email): Unit = js.native
  
  def addCustomArg(substitution: CustomArgs): Unit = js.native
  
  def addHeader(header: Header): Unit = js.native
  
  def addSubstitution(substitution: Substitution): Unit = js.native
  
  def addTo(email: Email): Unit = js.native
  
  def getBccs(): js.Array[Email] = js.native
  
  def getCcs(): js.Array[Email] = js.native
  
  def getCustomArgs(): js.Array[CustomArgs] = js.native
  
  def getHeaders(): js.Array[Header] = js.native
  
  def getSendAt(): Double = js.native
  
  def getSubject(): String = js.native
  
  def getSubstitutions(): StringDictionary[String] = js.native
  
  def getTos(): js.Array[Email] = js.native
  
  def setSendAt(sendAt: Double): Unit = js.native
  
  def setSubject(subject: String): Unit = js.native
  
  def toJSON(): Cc = js.native
}
object Personalization {
  
  @scala.inline
  def apply(
    addBcc: Email => Unit,
    addCc: Email => Unit,
    addCustomArg: CustomArgs => Unit,
    addHeader: Header => Unit,
    addSubstitution: Substitution => Unit,
    addTo: Email => Unit,
    getBccs: () => js.Array[Email],
    getCcs: () => js.Array[Email],
    getCustomArgs: () => js.Array[CustomArgs],
    getHeaders: () => js.Array[Header],
    getSendAt: () => Double,
    getSubject: () => String,
    getSubstitutions: () => StringDictionary[String],
    getTos: () => js.Array[Email],
    setSendAt: Double => Unit,
    setSubject: String => Unit,
    toJSON: () => Cc
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1(addBcc), addCc = js.Any.fromFunction1(addCc), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addSubstitution = js.Any.fromFunction1(addSubstitution), addTo = js.Any.fromFunction1(addTo), getBccs = js.Any.fromFunction0(getBccs), getCcs = js.Any.fromFunction0(getCcs), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getHeaders = js.Any.fromFunction0(getHeaders), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getSubstitutions = js.Any.fromFunction0(getSubstitutions), getTos = js.Any.fromFunction0(getTos), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Personalization]
  }
  
  @scala.inline
  implicit class PersonalizationMutableBuilder[Self <: Personalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBcc(value: Email => Unit): Self = StObject.set(x, "addBcc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCc(value: Email => Unit): Self = StObject.set(x, "addCc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCustomArg(value: CustomArgs => Unit): Self = StObject.set(x, "addCustomArg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddHeader(value: Header => Unit): Self = StObject.set(x, "addHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSubstitution(value: Substitution => Unit): Self = StObject.set(x, "addSubstitution", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTo(value: Email => Unit): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBccs(value: () => js.Array[Email]): Self = StObject.set(x, "getBccs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCcs(value: () => js.Array[Email]): Self = StObject.set(x, "getCcs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomArgs(value: () => js.Array[CustomArgs]): Self = StObject.set(x, "getCustomArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeaders(value: () => js.Array[Header]): Self = StObject.set(x, "getHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSendAt(value: () => Double): Self = StObject.set(x, "getSendAt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubstitutions(value: () => StringDictionary[String]): Self = StObject.set(x, "getSubstitutions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTos(value: () => js.Array[Email]): Self = StObject.set(x, "getTos", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSendAt(value: Double => Unit): Self = StObject.set(x, "setSendAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = StObject.set(x, "setSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Cc): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
