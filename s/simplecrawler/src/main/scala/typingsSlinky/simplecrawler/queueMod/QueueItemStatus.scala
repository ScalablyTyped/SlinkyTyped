package typingsSlinky.simplecrawler.queueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.simplecrawler.simplecrawlerStrings.queued
  - typings.simplecrawler.simplecrawlerStrings.spooled
  - typings.simplecrawler.simplecrawlerStrings.headers
  - typings.simplecrawler.simplecrawlerStrings.downloaded
  - typings.simplecrawler.simplecrawlerStrings.redirected
  - typings.simplecrawler.simplecrawlerStrings.notfound
  - typings.simplecrawler.simplecrawlerStrings.failed
*/
trait QueueItemStatus extends js.Object

object QueueItemStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def downloaded: typingsSlinky.simplecrawler.simplecrawlerStrings.downloaded = this.cast("downloaded")
  @scala.inline
  def failed: typingsSlinky.simplecrawler.simplecrawlerStrings.failed = this.cast("failed")
  @scala.inline
  def headers: typingsSlinky.simplecrawler.simplecrawlerStrings.headers = this.cast("headers")
  @scala.inline
  def notfound: typingsSlinky.simplecrawler.simplecrawlerStrings.notfound = this.cast("notfound")
  @scala.inline
  def queued: typingsSlinky.simplecrawler.simplecrawlerStrings.queued = this.cast("queued")
  @scala.inline
  def redirected: typingsSlinky.simplecrawler.simplecrawlerStrings.redirected = this.cast("redirected")
  @scala.inline
  def spooled: typingsSlinky.simplecrawler.simplecrawlerStrings.spooled = this.cast("spooled")
}

