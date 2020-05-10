package typingsSlinky.yeomanTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunContextSettings extends js.Object {
  /**
  	 * Namespace (only used if Generator is a constructor)
  	 * @default 'gen:test'
  	 */
  var namespace: js.UndefOr[String] = js.native
  /**
  	 * File path to the generator (only used if Generator is a constructor)
  	 */
  var resolved: js.UndefOr[String] = js.native
  /**
  	 * Automatically run this generator in a tmp dir
  	 * @default true
  	 */
  var tmpdir: js.UndefOr[Boolean] = js.native
}

object RunContextSettings {
  @scala.inline
  def apply(): RunContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunContextSettings]
  }
  @scala.inline
  implicit class RunContextSettingsOps[Self <: RunContextSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withResolved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpdir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(js.undefined)
        ret
    }
  }
  
}

