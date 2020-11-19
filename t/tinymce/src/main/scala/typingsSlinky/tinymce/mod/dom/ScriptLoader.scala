package typingsSlinky.tinymce.mod.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptLoader extends js.Object {
  
  def add(url: String): Unit = js.native
  def add(
    url: String,
    success: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    failure: js.Function0[Unit]
  ): Unit = js.native
  def add(url: String, success: js.UndefOr[scala.Nothing], scope: js.Object): Unit = js.native
  def add(url: String, success: js.UndefOr[scala.Nothing], scope: js.Object, failure: js.Function0[Unit]): Unit = js.native
  def add(url: String, success: js.Function0[Unit]): Unit = js.native
  def add(
    url: String,
    success: js.Function0[Unit],
    scope: js.UndefOr[scala.Nothing],
    failure: js.Function0[Unit]
  ): Unit = js.native
  def add(url: String, success: js.Function0[Unit], scope: js.Object): Unit = js.native
  def add(url: String, success: js.Function0[Unit], scope: js.Object, failure: js.Function0[Unit]): Unit = js.native
  
  def isDone(url: String): Boolean = js.native
  
  def load(url: String): Unit = js.native
  def load(url: String, callback1: js.UndefOr[scala.Nothing], callback2: js.Function0[Unit]): Unit = js.native
  def load(url: String, callback1: js.Function0[Unit]): Unit = js.native
  def load(url: String, callback1: js.Function0[Unit], callback2: js.Function0[Unit]): Unit = js.native
  
  def loadQueue(): Unit = js.native
  def loadQueue(success: js.UndefOr[scala.Nothing], failure: js.UndefOr[scala.Nothing], scope: js.Object): Unit = js.native
  def loadQueue(success: js.UndefOr[scala.Nothing], failure: js.Function0[Unit]): Unit = js.native
  def loadQueue(success: js.UndefOr[scala.Nothing], failure: js.Function0[Unit], scope: js.Object): Unit = js.native
  def loadQueue(success: js.Function0[Unit]): Unit = js.native
  def loadQueue(success: js.Function0[Unit], failure: js.UndefOr[scala.Nothing], scope: js.Object): Unit = js.native
  def loadQueue(success: js.Function0[Unit], failure: js.Function0[Unit]): Unit = js.native
  def loadQueue(success: js.Function0[Unit], failure: js.Function0[Unit], scope: js.Object): Unit = js.native
  
  def loadScripts(scripts: js.Array[String]): Unit = js.native
  def loadScripts(
    scripts: js.Array[String],
    callback1: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    callback2: js.Function0[Unit]
  ): Unit = js.native
  def loadScripts(scripts: js.Array[String], callback1: js.UndefOr[scala.Nothing], scope: js.Object): Unit = js.native
  def loadScripts(
    scripts: js.Array[String],
    callback1: js.UndefOr[scala.Nothing],
    scope: js.Object,
    callback2: js.Function0[Unit]
  ): Unit = js.native
  def loadScripts(scripts: js.Array[String], callback1: js.Function0[Unit]): Unit = js.native
  def loadScripts(
    scripts: js.Array[String],
    callback1: js.Function0[Unit],
    scope: js.UndefOr[scala.Nothing],
    callback2: js.Function0[Unit]
  ): Unit = js.native
  def loadScripts(scripts: js.Array[String], callback1: js.Function0[Unit], scope: js.Object): Unit = js.native
  def loadScripts(
    scripts: js.Array[String],
    callback1: js.Function0[Unit],
    scope: js.Object,
    callback2: js.Function0[Unit]
  ): Unit = js.native
  
  def markDone(url: String): Unit = js.native
}
