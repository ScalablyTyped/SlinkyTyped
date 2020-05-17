package typingsSlinky.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * On iOS, there is an additional object `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data in the encrypted iOS Keychain.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
@js.native
trait Storage extends js.Object {
  /**
    * The number of items in the storage.
    * @constant
    */
  val length: Double = js.native
  /**
    * Remove all key/value pairs from the storage.
    */
  def clear(): Unit = js.native
  /**
    * Retrieves the value associated with the given key.
    * @param key
    */
  def getItem(key: String): String | Null = js.native
  /**
    * Returns the name of the key at the given index in the storage. The order of keys is platform
    * dependent, you should not rely on it to be deterministic
    * @param index
    */
  def key(index: Double): String = js.native
  /**
    * Removes the given key/value pair from the storage.
    * @param key
    */
  def removeItem(key: String): Unit = js.native
  /**
    * Stores a string value using the given key.
    * @param key
    * @param value
    */
  def setItem(key: String, value: String): Unit = js.native
}

object Storage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: String => String | Null,
    key: Double => String,
    length: Double,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetItem(value: String => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveItem(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetItem(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

