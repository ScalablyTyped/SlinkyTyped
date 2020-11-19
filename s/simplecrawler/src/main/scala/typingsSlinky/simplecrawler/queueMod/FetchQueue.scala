package typingsSlinky.simplecrawler.queueMod

import typingsSlinky.simplecrawler.simplecrawlerNumbers.`0`
import typingsSlinky.simplecrawler.simplecrawlerNumbers.`1`
import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchQueue
  extends Array[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
    ] {
  
  def add(queueItem: QueueItem): Unit = js.native
  def add(
    queueItem: QueueItem,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
  ): Unit = js.native
  def add(queueItem: QueueItem, force: Boolean): Unit = js.native
  def add(
    queueItem: QueueItem,
    force: Boolean,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
  ): Unit = js.native
  
  def avg(statisticName: String): Unit = js.native
  def avg(
    statisticName: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* average */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  def countItems(comparator: js.Object): Unit = js.native
  def countItems(
    comparator: js.Object,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* count */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  def defrost(filename: String): Unit = js.native
  def defrost(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def exists(url: String, callback: js.Function2[/* error */ js.Error | Null, /* exists */ `0` | `1`, Unit]): Unit = js.native
  
  def filterItems(comparator: js.Object): Unit = js.native
  def filterItems(
    comparator: js.Object,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* items */ js.UndefOr[js.Array[QueueItem]], Unit]
  ): Unit = js.native
  
  def freeze(filename: String): Unit = js.native
  def freeze(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  
  def get(index: Double): Unit = js.native
  def get(
    index: Double,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
  ): Unit = js.native
  
  def getLength(): Unit = js.native
  def getLength(callback: js.Function2[/* error */ js.UndefOr[js.Error], /* length */ js.UndefOr[Double], Unit]): Unit = js.native
  
  def max(statisticName: String): Unit = js.native
  def max(
    statisticName: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* maximum */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  def min(statisticName: String): Unit = js.native
  def min(
    statisticName: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* minimum */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  
  def oldestUnfetchedItem(): Unit = js.native
  def oldestUnfetchedItem(
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
  ): Unit = js.native
  
  def update(id: Double, updates: js.Object): Unit = js.native
  def update(
    id: Double,
    updates: js.Object,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
  ): Unit = js.native
}
