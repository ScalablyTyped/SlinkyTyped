package typingsSlinky.uuid.mod

import typingsSlinky.uuid.interfacesMod.InputBuffer
import typingsSlinky.uuid.interfacesMod.OutputBuffer
import typingsSlinky.uuid.interfacesMod.V1Options
import typingsSlinky.uuid.interfacesMod.V4Options
import typingsSlinky.uuid.interfacesMod.v1
import typingsSlinky.uuid.interfacesMod.v3
import typingsSlinky.uuid.interfacesMod.v4
import typingsSlinky.uuid.interfacesMod.v5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UuidStatic extends js.Object {
  @JSName("v1")
  var v1_Original: v1 = js.native
  @JSName("v3")
  var v3_Original: v3 = js.native
  @JSName("v4")
  var v4_Original: v4 = js.native
  @JSName("v5")
  var v5_Original: v5 = js.native
  def v1(): String = js.native
  def v1(options: V1Options): String = js.native
  def v1[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T, offset: Double): T = js.native
  def v1[T /* <: OutputBuffer */](options: Null, buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: Null, buffer: T, offset: Double): T = js.native
  def v1[T /* <: OutputBuffer */](options: V1Options, buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: V1Options, buffer: T, offset: Double): T = js.native
  def v3(name: String, namespace: String): String = js.native
  def v3(name: String, namespace: InputBuffer): String = js.native
  def v3(name: InputBuffer, namespace: String): String = js.native
  def v3(name: InputBuffer, namespace: InputBuffer): String = js.native
  def v3[T /* <: OutputBuffer */](name: String, namespace: String, buffer: T): T = js.native
  def v3[T /* <: OutputBuffer */](name: String, namespace: String, buffer: T, offset: Double): T = js.native
  def v3[T /* <: OutputBuffer */](name: String, namespace: InputBuffer, buffer: T): T = js.native
  def v3[T /* <: OutputBuffer */](name: String, namespace: InputBuffer, buffer: T, offset: Double): T = js.native
  def v3[T /* <: OutputBuffer */](name: InputBuffer, namespace: String, buffer: T): T = js.native
  def v3[T /* <: OutputBuffer */](name: InputBuffer, namespace: String, buffer: T, offset: Double): T = js.native
  def v3[T /* <: OutputBuffer */](name: InputBuffer, namespace: InputBuffer, buffer: T): T = js.native
  def v3[T /* <: OutputBuffer */](name: InputBuffer, namespace: InputBuffer, buffer: T, offset: Double): T = js.native
  def v4(): String = js.native
  def v4(options: V4Options): String = js.native
  def v4[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T, offset: Double): T = js.native
  def v4[T /* <: OutputBuffer */](options: Null, buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: Null, buffer: T, offset: Double): T = js.native
  def v4[T /* <: OutputBuffer */](options: V4Options, buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: V4Options, buffer: T, offset: Double): T = js.native
  def v5(name: String, namespace: String): String = js.native
  def v5(name: String, namespace: InputBuffer): String = js.native
  def v5(name: InputBuffer, namespace: String): String = js.native
  def v5(name: InputBuffer, namespace: InputBuffer): String = js.native
  def v5[T /* <: OutputBuffer */](name: String, namespace: String, buffer: T): T = js.native
  def v5[T /* <: OutputBuffer */](name: String, namespace: String, buffer: T, offset: Double): T = js.native
  def v5[T /* <: OutputBuffer */](name: String, namespace: InputBuffer, buffer: T): T = js.native
  def v5[T /* <: OutputBuffer */](name: String, namespace: InputBuffer, buffer: T, offset: Double): T = js.native
  def v5[T /* <: OutputBuffer */](name: InputBuffer, namespace: String, buffer: T): T = js.native
  def v5[T /* <: OutputBuffer */](name: InputBuffer, namespace: String, buffer: T, offset: Double): T = js.native
  def v5[T /* <: OutputBuffer */](name: InputBuffer, namespace: InputBuffer, buffer: T): T = js.native
  def v5[T /* <: OutputBuffer */](name: InputBuffer, namespace: InputBuffer, buffer: T, offset: Double): T = js.native
}

