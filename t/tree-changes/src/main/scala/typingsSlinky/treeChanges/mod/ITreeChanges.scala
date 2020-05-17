package typingsSlinky.treeChanges.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeChanges extends js.Object {
  def changed(): Boolean = js.native
  def changed(key: String): Boolean = js.native
  def changed(key: Double): Boolean = js.native
  def changedFrom(key: String, previous: TypeInput): Boolean = js.native
  def changedFrom(key: String, previous: TypeInput, actual: TypeInput): Boolean = js.native
  def changedFrom(key: Double, previous: TypeInput): Boolean = js.native
  def changedFrom(key: Double, previous: TypeInput, actual: TypeInput): Boolean = js.native
  def changedTo(key: String, actual: TypeInput): Boolean = js.native
  def changedTo(key: Double, actual: TypeInput): Boolean = js.native
  def decreased(key: String): Boolean = js.native
  def decreased(key: Double): Boolean = js.native
  def increased(key: String): Boolean = js.native
  def increased(key: Double): Boolean = js.native
}

