package typingsSlinky.slateDashReact

import typingsSlinky.slate.slateMod.Editor
import typingsSlinky.slate.slateMod.Mark
import typingsSlinky.slate.slateMod.MarkJSON
import typingsSlinky.slate.slateMod.MarkProperties
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyLengthNewProperties extends js.Object {
  def apply(key: String, offset: Double, length: Double, properties: String, newProperties: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    length: Double,
    properties: String,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(key: String, offset: Double, length: Double, properties: MarkJSON, newProperties: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    length: Double,
    properties: MarkJSON,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(key: String, offset: Double, length: Double, properties: MarkProperties, newProperties: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
  def apply(key: String, offset: Double, length: Double, properties: Mark, newProperties: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    length: Double,
    properties: Mark,
    newProperties: Partial[Mark | MarkJSON | MarkProperties]
  ): Editor = js.native
}

