package typingsSlinky.winrt.Windows.Devices.Enumeration.Pnp

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
class PnpObject () extends IPnpObject

/* static members */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
object PnpObject extends js.Object {
  def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[PnpObject] = js.native
  def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): PnpObjectWatcher = js.native
  def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): PnpObjectWatcher = js.native
  def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[PnpObjectCollection] = js.native
  def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[PnpObjectCollection] = js.native
}

