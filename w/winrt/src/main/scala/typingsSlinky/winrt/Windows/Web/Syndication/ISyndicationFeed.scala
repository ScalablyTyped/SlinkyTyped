package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationFeed extends ISyndicationNode {
  var authors: IVector[SyndicationPerson] = js.native
  var categories: IVector[SyndicationCategory] = js.native
  var contributors: IVector[SyndicationPerson] = js.native
  var firstUri: Uri = js.native
  var generator: SyndicationGenerator = js.native
  var iconUri: Uri = js.native
  var id: String = js.native
  var imageUri: Uri = js.native
  var items: IVector[SyndicationItem] = js.native
  var lastUpdatedTime: js.Date = js.native
  var lastUri: Uri = js.native
  var links: IVector[SyndicationLink] = js.native
  var nextUri: Uri = js.native
  var previousUri: Uri = js.native
  var rights: ISyndicationText = js.native
  var sourceFormat: SyndicationFormat = js.native
  var subtitle: ISyndicationText = js.native
  var title: ISyndicationText = js.native
  def load(feed: String): Unit = js.native
  def loadFromXml(feedDocument: XmlDocument): Unit = js.native
}

object ISyndicationFeed {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    contributors: IVector[SyndicationPerson],
    elementExtensions: IVector[ISyndicationNode],
    firstUri: Uri,
    generator: SyndicationGenerator,
    getXmlDocument: SyndicationFormat => XmlDocument,
    iconUri: Uri,
    id: String,
    imageUri: Uri,
    items: IVector[SyndicationItem],
    language: String,
    lastUpdatedTime: js.Date,
    lastUri: Uri,
    links: IVector[SyndicationLink],
    load: String => Unit,
    loadFromXml: XmlDocument => Unit,
    nextUri: Uri,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    previousUri: Uri,
    rights: ISyndicationText,
    sourceFormat: SyndicationFormat,
    subtitle: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationFeed]
  }
  @scala.inline
  implicit class ISyndicationFeedOps[Self <: ISyndicationFeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthors(value: IVector[SyndicationPerson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: IVector[SyndicationCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributors(value: IVector[SyndicationPerson]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerator(value: SyndicationGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: IVector[SyndicationItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: IVector[SyndicationLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadFromXml(value: XmlDocument => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFromXml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRights(value: ISyndicationText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceFormat(value: SyndicationFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: ISyndicationText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: ISyndicationText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

