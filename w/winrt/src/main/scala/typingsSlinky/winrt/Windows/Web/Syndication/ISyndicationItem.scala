package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationItem extends ISyndicationNode {
  
  var authors: IVector[SyndicationPerson] = js.native
  
  var categories: IVector[SyndicationCategory] = js.native
  
  var commentsUri: Uri = js.native
  
  var content: SyndicationContent = js.native
  
  var contributors: IVector[SyndicationPerson] = js.native
  
  var eTag: String = js.native
  
  var editMediaUri: Uri = js.native
  
  var editUri: Uri = js.native
  
  var id: String = js.native
  
  var itemUri: Uri = js.native
  
  var lastUpdatedTime: js.Date = js.native
  
  var links: IVector[SyndicationLink] = js.native
  
  def load(item: String): Unit = js.native
  
  def loadFromXml(itemDocument: XmlDocument): Unit = js.native
  
  var publishedDate: js.Date = js.native
  
  var rights: ISyndicationText = js.native
  
  var source: SyndicationFeed = js.native
  
  var summary: ISyndicationText = js.native
  
  var title: ISyndicationText = js.native
}
object ISyndicationItem {
  
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    commentsUri: Uri,
    content: SyndicationContent,
    contributors: IVector[SyndicationPerson],
    eTag: String,
    editMediaUri: Uri,
    editUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => XmlDocument,
    id: String,
    itemUri: Uri,
    language: String,
    lastUpdatedTime: js.Date,
    links: IVector[SyndicationLink],
    load: String => Unit,
    loadFromXml: XmlDocument => Unit,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    publishedDate: js.Date,
    rights: ISyndicationText,
    source: SyndicationFeed,
    summary: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationItem = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], commentsUri = commentsUri.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], editMediaUri = editMediaUri.asInstanceOf[js.Any], editUri = editUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), id = id.asInstanceOf[js.Any], itemUri = itemUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), loadFromXml = js.Any.fromFunction1(loadFromXml), nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationItem]
  }
  
  @scala.inline
  implicit class ISyndicationItemMutableBuilder[Self <: ISyndicationItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: IVector[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUri(value: Uri): Self = StObject.set(x, "commentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: SyndicationContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditMediaUri(value: Uri): Self = StObject.set(x, "editMediaUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUri(value: Uri): Self = StObject.set(x, "editUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUri(value: Uri): Self = StObject.set(x, "itemUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: IVector[SyndicationLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadFromXml(value: XmlDocument => Unit): Self = StObject.set(x, "loadFromXml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRights(value: ISyndicationText): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: SyndicationFeed): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: ISyndicationText): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
