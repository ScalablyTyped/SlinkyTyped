package typingsSlinky.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[typingsSlinky.std.Intl.NumberFormat]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typingsSlinky.std.Intl.NumberFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ NumberFormatOptions, 
      typingsSlinky.std.Intl.NumberFormat
    ] {
  def apply(): typingsSlinky.std.Intl.NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): typingsSlinky.std.Intl.NumberFormat = js.native
  def apply(locales: String): typingsSlinky.std.Intl.NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): typingsSlinky.std.Intl.NumberFormat = js.native
  def apply(locales: js.Array[String]): typingsSlinky.std.Intl.NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): typingsSlinky.std.Intl.NumberFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}

