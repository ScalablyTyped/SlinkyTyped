package typingsSlinky.snykDockerPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extractorTypesMod {
  type ExtractCallback = js.Function1[
    /* dataStream */ typingsSlinky.node.streamMod.Readable, 
    js.Promise[java.lang.String | typingsSlinky.node.Buffer]
  ]
  type ExtractedLayers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.snykDockerPlugin.extractorTypesMod.FileNameAndContent]
  type FileNameAndContent = typingsSlinky.std.Record[java.lang.String, java.lang.String | typingsSlinky.node.Buffer]
}
