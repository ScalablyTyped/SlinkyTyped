package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.AnonHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionTracking extends js.Object {
  def getEnable(): Boolean = js.native
  def getHtml(): String = js.native
  def getSubstitutionTag(): String = js.native
  def getText(): String = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setHtml(html: String): Unit = js.native
  def setSubstitutionTag(substitutionTag: String): Unit = js.native
  def setText(text: String): Unit = js.native
  def toJSON(): AnonHtml = js.native
}

object SubscriptionTracking {
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getHtml: () => String,
    getSubstitutionTag: () => String,
    getText: () => String,
    setEnable: Boolean => Unit,
    setHtml: String => Unit,
    setSubstitutionTag: String => Unit,
    setText: String => Unit,
    toJSON: () => AnonHtml
  ): SubscriptionTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getSubstitutionTag = js.Any.fromFunction0(getSubstitutionTag), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setSubstitutionTag = js.Any.fromFunction1(setSubstitutionTag), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SubscriptionTracking]
  }
  @scala.inline
  implicit class SubscriptionTrackingOps[Self <: SubscriptionTracking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHtml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHtml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubstitutionTag(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubstitutionTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHtml(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubstitutionTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubstitutionTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => AnonHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

