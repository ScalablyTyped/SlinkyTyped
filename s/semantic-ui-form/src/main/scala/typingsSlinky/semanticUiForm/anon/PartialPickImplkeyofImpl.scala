package typingsSlinky.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.semanticUiForm.JQuery
import typingsSlinky.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.ErrorSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.Field
import typingsSlinky.semanticUiForm.SemanticUI.Form.MetadataSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.PromptSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.SelectorSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typingsSlinky.semanticUiForm.SemanticUI.Form.TextSettings
import typingsSlinky.semanticUiForm.semanticUiFormStrings.blur
import typingsSlinky.semanticUiForm.semanticUiFormStrings.change
import typingsSlinky.semanticUiForm.semanticUiFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, keyof semantic-ui-form.SemanticUI.FormSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var className: js.UndefOr[ClassNameSettings] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaults: js.UndefOr[StringDictionary[Field]] = js.native
  var delay: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var fields: js.UndefOr[StringDictionary[String | js.Array[String] | Field]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[MetadataSettings] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var on: js.UndefOr[submit | blur | change] = js.native
  var onFailure: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ] = js.native
  var onInvalid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onSuccess: js.UndefOr[
    js.ThisFunction2[
      /* this */ JQuery, 
      /* event */ TriggeredEvent[HTMLElement, _, _, _], 
      /* fields */ js.Any, 
      Unit
    ]
  ] = js.native
  var onValid: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[PromptSettings] = js.native
  var revalidate: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]
  ] = js.native
  var selector: js.UndefOr[SelectorSettings] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[TemplatesSettings] = js.native
  var text: js.UndefOr[TextSettings] = js.native
  var transition: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: ClassNameSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: StringDictionary[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: ErrorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[String | js.Array[String] | Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: MetadataSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
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
    def withOn(value: submit | blur | change): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(
      value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(
      value: js.ThisFunction2[
          /* this */ JQuery, 
          /* event */ TriggeredEvent[HTMLElement, _, _, _], 
          /* fields */ js.Any, 
          Unit
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValid")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: PromptSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withRevalidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ js.Any, Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: SelectorSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: TemplatesSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: TextSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

