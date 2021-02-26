package typingsSlinky.vis.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vis.anon.End
import typingsSlinky.vis.anon.Groups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vis", "Graph2d")
@js.native
class Graph2d protected () extends StObject {
  def this(container: HTMLElement, items: DataItemCollectionType) = this()
  def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
  def this(container: HTMLElement, items: DataItemCollectionType, options: Graph2dOptions) = this()
  def this(
    container: HTMLElement,
    items: DataItemCollectionType,
    groups: DataGroupCollectionType,
    options: Graph2dOptions
  ) = this()
  
  def addCustomTime(time: DateType): IdType = js.native
  def addCustomTime(time: DateType, id: IdType): IdType = js.native
  
  def destroy(): Unit = js.native
  
  def fit(): Unit = js.native
  def fit(options: TimelineAnimationOptions): Unit = js.native
  
  def focus(ids: js.Array[IdType]): Unit = js.native
  def focus(ids: js.Array[IdType], options: TimelineAnimationOptions): Unit = js.native
  def focus(ids: IdType): Unit = js.native
  def focus(ids: IdType, options: TimelineAnimationOptions): Unit = js.native
  def focus(selection: js.Any): Unit = js.native
  
  def getCurrentTime(): js.Date = js.native
  
  def getCustomTime(): js.Date = js.native
  def getCustomTime(id: IdType): js.Date = js.native
  
  def getEventProperties(event: Event): TimelineEventPropertiesResult = js.native
  
  def getItemRange(): js.Any = js.native
  
  def getLegend(): TimelineWindow = js.native
  
  // TODO
  def getSelection(): js.Array[IdType] = js.native
  
  def getVisibleItems(): js.Array[IdType] = js.native
  
  def getWindow(): TimelineWindow = js.native
  @JSName("getWindow")
  def getWindow_End(): End = js.native
  
  def moveTo(time: DateType): Unit = js.native
  def moveTo(time: DateType, options: TimelineAnimationOptions): Unit = js.native
  
  def off(event: TimelineEvents, callback: js.Function0[Unit]): Unit = js.native
  
  def on(): Unit = js.native
  def on(event: js.UndefOr[scala.Nothing], callback: js.Function1[/* properties */ js.Any, Unit]): Unit = js.native
  def on(event: String): Unit = js.native
  def on(event: String, callback: js.Function1[/* properties */ js.Any, Unit]): Unit = js.native
  def on(event: TimelineEvents, callback: js.Function0[Unit]): Unit = js.native
  
  def redraw(): Unit = js.native
  
  def removeCustomTime(id: IdType): Unit = js.native
  
  def setCurrentTime(time: DateType): Unit = js.native
  
  def setCustomTime(time: DateType): Unit = js.native
  def setCustomTime(time: DateType, id: IdType): Unit = js.native
  
  def setCustomTimeTitle(title: String): Unit = js.native
  def setCustomTimeTitle(title: String, id: IdType): Unit = js.native
  
  def setData(data: Groups): Unit = js.native
  
  def setGroups(): Unit = js.native
  def setGroups(groups: js.Array[TimelineGroup]): Unit = js.native
  def setGroups(groups: DataGroupCollectionType): Unit = js.native
  
  def setItems(): Unit = js.native
  def setItems(items: js.Array[TimelineItem]): Unit = js.native
  def setItems(items: DataItemCollectionType): Unit = js.native
  
  def setOptions(options: TimelineOptions): Unit = js.native
  
  def setSelection(ids: js.Array[IdType]): Unit = js.native
  def setSelection(ids: IdType): Unit = js.native
  
  def setWindow(start: js.Any, date: js.Any): Unit = js.native
  def setWindow(start: DateType, end: DateType): Unit = js.native
  def setWindow(start: DateType, end: DateType, options: TimelineAnimationOptions): Unit = js.native
}
