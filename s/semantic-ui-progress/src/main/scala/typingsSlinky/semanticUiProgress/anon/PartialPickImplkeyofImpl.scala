package typingsSlinky.semanticUiProgress.anon

import typingsSlinky.semanticUiProgress.JQuery
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ClassNameSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.ErrorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.MetadataSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RegExpSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.SelectorSettings
import typingsSlinky.semanticUiProgress.SemanticUI.Progress.TextSettings
import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.percent
import typingsSlinky.semanticUiProgress.semanticUiProgressStrings.ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, keyof semantic-ui-progress.SemanticUI.ProgressSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
  var autoSuccess: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var label: js.UndefOr[percent | ratio] = js.native
  
  var limitValues: js.UndefOr[Boolean] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var onActive: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onError: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var onSuccess: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]] = js.native
  
  var onWarning: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]
  ] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var random: js.UndefOr[RandomSettings] = js.native
  
  var regExp: js.UndefOr[RegExpSettings] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var showActivity: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[TextSettings] = js.native
  
  var total: js.UndefOr[`false` | Double] = js.native
  
  var value: js.UndefOr[`false` | Double] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSuccess(value: Boolean): Self = StObject.set(x, "autoSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSuccessUndefined: Self = StObject.set(x, "autoSuccess", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setLabel(value: percent | ratio): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLimitValues(value: Boolean): Self = StObject.set(x, "limitValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitValuesUndefined: Self = StObject.set(x, "limitValues", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setOnActive(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* percent */ Double, /* value */ Double, /* total */ Double, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: js.ThisFunction1[/* this */ JQuery, /* total */ Double, Unit]): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setOnWarning(value: js.ThisFunction2[/* this */ JQuery, /* value */ Double, /* total */ Double, Unit]): Self = StObject.set(x, "onWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnWarningUndefined: Self = StObject.set(x, "onWarning", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRandom(value: RandomSettings): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setShowActivity(value: Boolean): Self = StObject.set(x, "showActivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowActivityUndefined: Self = StObject.set(x, "showActivity", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTotal(value: `false` | Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setValue(value: `false` | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
