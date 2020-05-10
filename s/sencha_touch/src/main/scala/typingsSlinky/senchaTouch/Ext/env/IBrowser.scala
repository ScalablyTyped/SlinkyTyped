package typingsSlinky.senchaTouch.Ext.env

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrowser extends IBase {
  /** [Property] (String) */
  var engineName: js.UndefOr[String] = js.native
  /** [Property] (Ext.Version) */
  var engineVersion: js.UndefOr[IVersion] = js.native
  /** [Method] A hybrid property can be either accessed as a method call for example  if Ext browser is IE
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Boolean]] = js.native
  /** [Property] (Boolean) */
  var isSecure: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isStrict: js.UndefOr[Boolean] = js.native
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var userAgent: js.UndefOr[String] = js.native
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.native
}

object IBrowser {
  @scala.inline
  def apply(): IBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowser]
  }
  @scala.inline
  implicit class IBrowserOps[Self <: IBrowser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineName")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: IVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIs(value: /* value */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: IVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

