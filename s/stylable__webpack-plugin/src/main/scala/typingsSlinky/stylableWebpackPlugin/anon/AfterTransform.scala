package typingsSlinky.stylableWebpackPlugin.anon

import typingsSlinky.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typingsSlinky.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterTransform extends StObject {
  
  var afterTransform: js.Any = js.native
  
  var runtimeStylesheetId: module | namespace = js.native
}
object AfterTransform {
  
  @scala.inline
  def apply(afterTransform: js.Any, runtimeStylesheetId: module | namespace): AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = afterTransform.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterTransform]
  }
  
  @scala.inline
  implicit class AfterTransformMutableBuilder[Self <: AfterTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
  }
}
