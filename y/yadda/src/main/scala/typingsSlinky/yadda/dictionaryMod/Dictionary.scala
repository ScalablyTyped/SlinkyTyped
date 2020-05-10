package typingsSlinky.yadda.dictionaryMod

import typingsSlinky.yadda.libMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary extends js.Object {
  def define(term: String, pattern: String): this.type = js.native
  def define(term: String, pattern: String, converters: js.Array[Converter]): this.type = js.native
  def define(term: String, pattern: String, converters: Converter): this.type = js.native
  def define(term: String, pattern: js.RegExp): this.type = js.native
  def define(term: String, pattern: js.RegExp, converters: js.Array[Converter]): this.type = js.native
  def define(term: String, pattern: js.RegExp, converters: Converter): this.type = js.native
  def merge(other: Dictionary): Dictionary = js.native
}

