package typingsSlinky.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.PluralRules")
@js.native
object PluralRules
  extends Instantiable0[typingsSlinky.std.Intl.PluralRules]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typingsSlinky.std.Intl.PluralRules
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ PluralRulesOptions, 
      typingsSlinky.std.Intl.PluralRules
    ] {
  
  def apply(): typingsSlinky.std.Intl.PluralRules = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): typingsSlinky.std.Intl.PluralRules = js.native
  def apply(locales: String): typingsSlinky.std.Intl.PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): typingsSlinky.std.Intl.PluralRules = js.native
  def apply(locales: js.Array[String]): typingsSlinky.std.Intl.PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): typingsSlinky.std.Intl.PluralRules = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}
