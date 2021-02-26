package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.AjaxSettings
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxErrorHandlerMod {
  
  type AjaxErrorHandler[TElement] = js.Function4[
    /* config */ TablesorterConfigurationStore[TElement], 
    /* request */ jqXHR[js.Any], 
    /* ajaxSettings */ AjaxSettings[js.Any], 
    /* thrownError */ String, 
    String
  ]
}
