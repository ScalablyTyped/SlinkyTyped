package typingsSlinky.tabris.global

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
@JSGlobal("Storage")
@js.native
class Storage protected ()
  extends typingsSlinky.tabris.Storage

