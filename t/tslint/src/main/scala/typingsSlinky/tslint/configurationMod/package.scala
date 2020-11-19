package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object configurationMod {
  
  type RawRuleConfig = js.UndefOr[
    scala.Null | scala.Boolean | js.Array[js.Any] | typingsSlinky.tslint.anon.Severity
  ]
  
  type RawRulesConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tslint.configurationMod.RawRuleConfig]
}
