package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBEnvironment extends js.Object {
  val indexedDB: org.scalajs.dom.raw.IDBFactory
}

object IDBEnvironment {
  @scala.inline
  def apply(indexedDB: org.scalajs.dom.raw.IDBFactory): IDBEnvironment = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDBEnvironment]
  }
}

