package typingsSlinky.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderProperties extends js.Object {
  def getEncodedQuery(): String = js.native
  def getListControl(): js.Any = js.native
  def getParameterValue(value: String): String = js.native
  def getParameters(): js.Array[String] = js.native
  def getReferringURL(): String = js.native
  def getViewName(): String = js.native
  def getWindowProperties(): js.Any = js.native
  def isInDevStudio(): Boolean = js.native
  def isInteractive(): Boolean = js.native
  def isManyToMany(): Boolean = js.native
  def isRelatedList(): Boolean = js.native
}

object RenderProperties {
  @scala.inline
  def apply(
    getEncodedQuery: () => String,
    getListControl: () => js.Any,
    getParameterValue: String => String,
    getParameters: () => js.Array[String],
    getReferringURL: () => String,
    getViewName: () => String,
    getWindowProperties: () => js.Any,
    isInDevStudio: () => Boolean,
    isInteractive: () => Boolean,
    isManyToMany: () => Boolean,
    isRelatedList: () => Boolean
  ): RenderProperties = {
    val __obj = js.Dynamic.literal(getEncodedQuery = js.Any.fromFunction0(getEncodedQuery), getListControl = js.Any.fromFunction0(getListControl), getParameterValue = js.Any.fromFunction1(getParameterValue), getParameters = js.Any.fromFunction0(getParameters), getReferringURL = js.Any.fromFunction0(getReferringURL), getViewName = js.Any.fromFunction0(getViewName), getWindowProperties = js.Any.fromFunction0(getWindowProperties), isInDevStudio = js.Any.fromFunction0(isInDevStudio), isInteractive = js.Any.fromFunction0(isInteractive), isManyToMany = js.Any.fromFunction0(isManyToMany), isRelatedList = js.Any.fromFunction0(isRelatedList))
    __obj.asInstanceOf[RenderProperties]
  }
  @scala.inline
  implicit class RenderPropertiesOps[Self <: RenderProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEncodedQuery(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncodedQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetListControl(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListControl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParameterValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameterValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetParameters(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParameters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReferringURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferringURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWindowProperties(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInDevStudio(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInDevStudio")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInteractive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsManyToMany(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isManyToMany")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRelatedList(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRelatedList")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

