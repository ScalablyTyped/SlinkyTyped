package typingsSlinky.senchaTouch.Ext.env

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.IVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOS extends IBase {
  /** [Method] A hybrid property can be either accessed as a method call i e  if Ext os is Android
  		* @param value String The OS name to check.
  		* @returns Boolean
  		*/
  var is: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Boolean]] = js.native
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Ext.Version) */
  var version: js.UndefOr[IVersion] = js.native
}

object IOS {
  @scala.inline
  def apply(): IOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOS]
  }
  @scala.inline
  implicit class IOSOps[Self <: IOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

