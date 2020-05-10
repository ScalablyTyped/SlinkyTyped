package typingsSlinky.uifabricMergeStyles.stylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyleSheetConfig extends js.Object {
  /**
    * CSP settings
    */
  var cspSettings: js.UndefOr[ICSPSettings] = js.native
  /**
    * Default 'displayName' to use for a className.
    * @defaultvalue 'css'
    */
  var defaultPrefix: js.UndefOr[String] = js.native
  /**
    * Injection mode for how rules are inserted.
    */
  var injectionMode: js.UndefOr[InjectionMode] = js.native
  /**
    * Default 'namespace' to attach before the className.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * Callback executed when a rule is inserted.
    */
  var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.native
  /**
    * Defines the default direction of rules for auto-rtlifying things.
    * While typically this is represented as a DIR attribute in the markup,
    * the DIR is not enough to control whether padding goes on the left or
    * right. Use this to set the default direction when rules are registered.
    */
  var rtl: js.UndefOr[Boolean] = js.native
}

object IStyleSheetConfig {
  @scala.inline
  def apply(): IStyleSheetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleSheetConfig]
  }
  @scala.inline
  implicit class IStyleSheetConfigOps[Self <: IStyleSheetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCspSettings(value: ICSPSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCspSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectionMode(value: InjectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectionMode")(js.undefined)
        ret
    }
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
    def withOnInsertRule(value: /* rule */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsertRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInsertRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsertRule")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
  }
  
}

