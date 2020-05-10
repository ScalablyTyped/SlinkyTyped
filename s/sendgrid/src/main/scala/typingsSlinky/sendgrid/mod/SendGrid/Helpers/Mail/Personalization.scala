package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sendgrid.AnonCc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Personalization extends js.Object {
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
  def toJSON(): AnonCc = js.native
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
    toJSON: () => AnonCc
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1(addBcc), addCc = js.Any.fromFunction1(addCc), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addSubstitution = js.Any.fromFunction1(addSubstitution), addTo = js.Any.fromFunction1(addTo), getBccs = js.Any.fromFunction0(getBccs), getCcs = js.Any.fromFunction0(getCcs), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getHeaders = js.Any.fromFunction0(getHeaders), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getSubstitutions = js.Any.fromFunction0(getSubstitutions), getTos = js.Any.fromFunction0(getTos), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Personalization]
  }
  @scala.inline
  implicit class PersonalizationOps[Self <: Personalization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBcc(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBcc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCc(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCustomArg(value: CustomArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomArg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddHeader(value: Header => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSubstitution(value: Substitution => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSubstitution")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddTo(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBccs(value: () => js.Array[Email]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBccs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCcs(value: () => js.Array[Email]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCcs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomArgs(value: () => js.Array[CustomArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaders(value: () => js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSendAt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSendAt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubstitutions(value: () => StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubstitutions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTos(value: () => js.Array[Email]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSendAt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSendAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => AnonCc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

