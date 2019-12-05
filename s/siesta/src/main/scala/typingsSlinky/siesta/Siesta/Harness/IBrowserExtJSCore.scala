package typingsSlinky.siesta.Siesta.Harness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IBrowserExtJSCore extends js.Object {
  var coverageUnit: String
  var excludeCoverageUnits: js.RegExp
  var installLoaderInstrumentationHook: Boolean
}

object IBrowserExtJSCore {
  @scala.inline
  def apply(coverageUnit: String, excludeCoverageUnits: js.RegExp, installLoaderInstrumentationHook: Boolean): IBrowserExtJSCore = {
    val __obj = js.Dynamic.literal(coverageUnit = coverageUnit.asInstanceOf[js.Any], excludeCoverageUnits = excludeCoverageUnits.asInstanceOf[js.Any], installLoaderInstrumentationHook = installLoaderInstrumentationHook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBrowserExtJSCore]
  }
}

