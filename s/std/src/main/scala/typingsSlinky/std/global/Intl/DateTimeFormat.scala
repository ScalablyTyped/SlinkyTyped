package typingsSlinky.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typingsSlinky.std.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      typingsSlinky.std.Intl.DateTimeFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ DateTimeFormatOptions, 
      typingsSlinky.std.Intl.DateTimeFormat
    ] {
  
  def apply(): typingsSlinky.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typingsSlinky.std.Intl.DateTimeFormat = js.native
  def apply(locales: String): typingsSlinky.std.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typingsSlinky.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String]): typingsSlinky.std.Intl.DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): typingsSlinky.std.Intl.DateTimeFormat = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}
