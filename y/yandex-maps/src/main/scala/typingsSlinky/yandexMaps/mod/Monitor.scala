package typingsSlinky.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Monitor")
@js.native
class Monitor protected () extends js.Object {
  def this(dataManager: IDataManager) = this()
  def this(dataManager: IOptionManager) = this()
  
  def add(
    name: String,
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): Monitor = js.native
  def add(
    name: String,
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.UndefOr[scala.Nothing],
    params: js.Any
  ): Monitor = js.native
  def add(
    name: String,
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Any
  ): Monitor = js.native
  def add(
    name: String,
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Any,
    params: js.Any
  ): Monitor = js.native
  def add(
    name: js.Array[String],
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): Monitor = js.native
  def add(
    name: js.Array[String],
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.UndefOr[scala.Nothing],
    params: js.Any
  ): Monitor = js.native
  def add(
    name: js.Array[String],
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Any
  ): Monitor = js.native
  def add(
    name: js.Array[String],
    changeCallback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Any,
    params: js.Any
  ): Monitor = js.native
  
  def forceChange(): Monitor = js.native
  
  def get(name: String): js.Any = js.native
  
  def remove(name: String): Monitor = js.native
  
  def removeAll(): Monitor = js.native
}
