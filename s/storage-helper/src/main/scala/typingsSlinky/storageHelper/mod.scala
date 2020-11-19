package typingsSlinky.storageHelper

import typingsSlinky.std.NonNullable
import typingsSlinky.storageHelper.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storage-helper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clear(): Unit = js.native
  
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
  
  def removeItem(key: String): Unit = js.native
  
  def setItem(key: String, value: String): Unit = js.native
  def setItem(key: String, value: String, permanent: Boolean): Unit = js.native
  
  def showStorageLogger(enabled: Boolean): Unit = js.native
  
  @js.native
  object default extends js.Object {
    
    def clear(): Unit = js.native
    @JSName("clear")
    var clear_Original: js.Function0[Unit] = js.native
    
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
    @JSName("getItem")
    var getItem_Original: FnCall = js.native
    
    def removeItem(key: String): Unit = js.native
    @JSName("removeItem")
    var removeItem_Original: js.Function1[/* key */ String, Unit] = js.native
    
    def setItem(key: String, value: String): Unit = js.native
    def setItem(key: String, value: String, permanent: Boolean): Unit = js.native
    @JSName("setItem")
    var setItem_Original: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit] = js.native
  }
}
