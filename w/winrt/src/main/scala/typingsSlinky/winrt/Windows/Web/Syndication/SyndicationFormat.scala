package typingsSlinky.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SyndicationFormat extends js.Object

@JSGlobal("Windows.Web.Syndication.SyndicationFormat")
@js.native
object SyndicationFormat extends js.Object {
  @js.native
  sealed trait atom03 extends SyndicationFormat
  
  @js.native
  sealed trait atom10 extends SyndicationFormat
  
  @js.native
  sealed trait rss091 extends SyndicationFormat
  
  @js.native
  sealed trait rss092 extends SyndicationFormat
  
  @js.native
  sealed trait rss10 extends SyndicationFormat
  
  @js.native
  sealed trait rss20 extends SyndicationFormat
  
  /* 5 */ val atom03: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.atom03 with Double = js.native
  /* 0 */ val atom10: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.atom10 with Double = js.native
  /* 4 */ val rss091: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss091 with Double = js.native
  /* 3 */ val rss092: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss092 with Double = js.native
  /* 2 */ val rss10: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss10 with Double = js.native
  /* 1 */ val rss20: typingsSlinky.winrt.Windows.Web.Syndication.SyndicationFormat.rss20 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SyndicationFormat with Double] = js.native
}

