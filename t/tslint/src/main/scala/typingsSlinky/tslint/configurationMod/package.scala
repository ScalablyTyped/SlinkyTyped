package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configurationMod {
  type RawRuleConfig = js.UndefOr[
    scala.Null | scala.Boolean | js.Array[js.Any] | typingsSlinky.tslint.AnonSeverity
  ]
  type RawRulesConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tslint.configurationMod.RawRuleConfig]
}
