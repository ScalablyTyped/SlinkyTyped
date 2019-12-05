package typingsSlinky.videoDotJs.videoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object videojs {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Node
  import typingsSlinky.videoDotJs.Anon_Children
  import typingsSlinky.videoDotJs.videoDotJsMod.VideoJsPlayer
  import typingsSlinky.videoDotJs.videoDotJsMod.VideoJsPlayerOptions

  type Child = String | Anon_Children
  type Component = Component_
  type Content = String | Element | Node | (js.Function0[String | Element | Node])
  type Dom = Dom_
  type LanguageTranslations = StringDictionary[String]
  type Player = VideoJsPlayer
  type PlayerOptions = VideoJsPlayerOptions
  type Plugin = Plugin_
  type Tech = Tech_
  type TextTrack = TextTrack_
  type TextTrackCueList = TextTrackCueList_
  type XhrCallback = js.Function3[
    /* error */ js.UndefOr[js.Error], 
    /* response */ js.UndefOr[XhrResponse], 
    /* body */ js.UndefOr[js.Any], 
    Unit
  ]
}
