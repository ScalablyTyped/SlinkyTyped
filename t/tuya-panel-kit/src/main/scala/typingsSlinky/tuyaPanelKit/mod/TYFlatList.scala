package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYFlatList")
@js.native
class TYFlatList[ItemT /* <: TYFlatListData */] protected ()
  extends Component[TYFlatListProps[ItemT], js.Object, js.Any] {
  def this(props: TYFlatListProps[ItemT]) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TYFlatListProps[ItemT], context: js.Any) = this()
}
/* static members */
object TYFlatList {
  
  @JSImport("tuya-panel-kit", "TYFlatList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TYFlatList.CheckboxItem")
  @js.native
  def CheckboxItem: ReactElement = js.native
  @scala.inline
  def CheckboxItem_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.InputItem")
  @js.native
  def InputItem: ReactElement = js.native
  @scala.inline
  def InputItem_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.Item")
  @js.native
  def Item: ReactElement = js.native
  @scala.inline
  def Item_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.SliderItem")
  @js.native
  def SliderItem: ReactElement = js.native
  @scala.inline
  def SliderItem_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYFlatList.SwitchItem")
  @js.native
  def SwitchItem: ReactElement = js.native
  @scala.inline
  def SwitchItem_=(x: ReactElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchItem")(x.asInstanceOf[js.Any])
}
