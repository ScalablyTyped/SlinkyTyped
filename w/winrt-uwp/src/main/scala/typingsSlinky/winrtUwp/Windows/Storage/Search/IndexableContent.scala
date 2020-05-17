package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */
@js.native
trait IndexableContent extends js.Object {
  /** Gets or sets the identifier for the content properties in the IndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: String = js.native
  /** Gets the content properties. */
  var properties: IMap[String, _] = js.native
  /** Gets or sets a Stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: IRandomAccessStream = js.native
  /** Specifies the type of content in the Stream . */
  var streamContentType: String = js.native
}

object IndexableContent {
  @scala.inline
  def apply(id: String, properties: IMap[String, _], stream: IRandomAccessStream, streamContentType: String): IndexableContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], streamContentType = streamContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexableContent]
  }
  @scala.inline
  implicit class IndexableContentOps[Self <: IndexableContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMap[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamContentType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

