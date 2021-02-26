package typingsSlinky.wordpressBlocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Attribute
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Children
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.HTML
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Meta
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Query[T]
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Text
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.None
  */
  type BlockAttribute[T] = typingsSlinky.wordpressBlocks.mod._BlockAttribute[T] | typingsSlinky.wordpressBlocks.mod.AttributeSource.Attribute | typingsSlinky.wordpressBlocks.mod.AttributeSource.None
  
  @scala.inline
  def cloneBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](block: typingsSlinky.wordpressBlocks.mod.BlockInstance[T]): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    block: typingsSlinky.wordpressBlocks.mod.BlockInstance[T],
    mergeAttributes: js.UndefOr[scala.Nothing],
    newInnerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    block: typingsSlinky.wordpressBlocks.mod.BlockInstance[T],
    mergeAttributes: typingsSlinky.std.Partial[T]
  ): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    block: typingsSlinky.wordpressBlocks.mod.BlockInstance[T],
    mergeAttributes: typingsSlinky.std.Partial[T],
    newInnerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  
  @scala.inline
  def createBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](name: java.lang.String): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    name: java.lang.String,
    attributes: js.UndefOr[scala.Nothing],
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](name: java.lang.String, attributes: typingsSlinky.std.Partial[T]): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    name: java.lang.String,
    attributes: typingsSlinky.std.Partial[T],
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.wordpressBlocks.mod.BlockInstance[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockInstance[T]]
  
  @scala.inline
  def doBlocksMatchTemplate(): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[scala.Boolean]
  @scala.inline
  def doBlocksMatchTemplate(
    blocks: js.UndefOr[scala.Nothing],
    template: typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def doBlocksMatchTemplate(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def doBlocksMatchTemplate(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ],
    template: typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def findTransform[T /* <: typingsSlinky.wordpressBlocks.mod.Transform[typingsSlinky.std.Record[java.lang.String, _]] */, U /* <: typingsSlinky.std.Record[java.lang.String, _] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, scala.Boolean]): typingsSlinky.wordpressBlocks.mod.Transform[U] | scala.Null = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.wordpressBlocks.mod.Transform[U] | scala.Null]
  
  @scala.inline
  def getBlockAttributes(blockTypeOrName: java.lang.String, innerHTML: java.lang.String): typingsSlinky.std.Record[java.lang.String, _] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.std.Record[java.lang.String, _]]
  @scala.inline
  def getBlockAttributes(
    blockTypeOrName: java.lang.String,
    innerHTML: java.lang.String,
    attributes: typingsSlinky.std.Record[java.lang.String, _]
  ): typingsSlinky.std.Record[java.lang.String, _] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.std.Record[java.lang.String, _]]
  @scala.inline
  def getBlockAttributes[T /* <: typingsSlinky.wordpressBlocks.mod.Block[_] */](blockTypeOrName: T, innerHTML: java.lang.String): js.Any = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getBlockAttributes[T /* <: typingsSlinky.wordpressBlocks.mod.Block[_] */](
    blockTypeOrName: T,
    innerHTML: java.lang.String,
    attributes: typingsSlinky.std.Record[java.lang.String, _]
  ): js.Any = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getBlockContent(
    block: typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ): java.lang.String = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getBlockDefaultClassName(blockName: java.lang.String): java.lang.String = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getBlockMenuDefaultClassName(blockName: java.lang.String): java.lang.String = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getBlockSupport_align(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_align(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_align[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_align[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_alignWide(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_alignWide(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_alignWide[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_alignWide[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_anchor(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_anchor(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_anchor[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_anchor[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_className(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_className(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_className[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_className[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_customClassName(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_customClassName(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_customClassName[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_customClassName[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_html(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_html(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_html[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_html[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_inserter(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_inserter(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_inserter[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_inserter[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_multiple(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_multiple(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_multiple[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_multiple[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockSupport_reusable(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_reusable(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable
  ): js.UndefOr[js.Any] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_reusable[T](
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  @scala.inline
  def getBlockSupport_reusable[T](
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable,
    defaultSupports: T
  ): T | scala.Boolean | scala.Double | java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | scala.Boolean | scala.Double | java.lang.String]
  
  @scala.inline
  def getBlockTransforms_from[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.from): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  @scala.inline
  def getBlockTransforms_from[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.from,
    blockTypeOrName: java.lang.String
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  @scala.inline
  def getBlockTransforms_from[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.from,
    blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[js.Object]
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  
  @scala.inline
  def getBlockTransforms_to[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.to): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  @scala.inline
  def getBlockTransforms_to[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.to,
    blockTypeOrName: java.lang.String
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  @scala.inline
  def getBlockTransforms_to[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](
    direction: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.to,
    blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[js.Object]
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Transform[T] with typingsSlinky.wordpressBlocks.anon.BlockName
  ]]
  
  @scala.inline
  def getBlockType[T](): js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]]]
  @scala.inline
  def getBlockType[T](name: java.lang.String): js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]]]
  
  @scala.inline
  def getBlockTypes(): js.Array[typingsSlinky.wordpressBlocks.mod.Block[_]] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[typingsSlinky.wordpressBlocks.mod.Block[_]]]
  
  @scala.inline
  def getCategories(): js.Array[typingsSlinky.wordpressBlocks.categoriesMod.Category] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[typingsSlinky.wordpressBlocks.categoriesMod.Category]]
  
  @scala.inline
  def getChildBlockNames(blockName: java.lang.String): js.Array[java.lang.String] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getDefaultBlockName(): js.UndefOr[java.lang.String] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def getFreeformContentHandlerName(): js.UndefOr[java.lang.String] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def getGroupingBlockName(): js.UndefOr[java.lang.String] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def getPhrasingContentSchema(): typingsSlinky.wordpressBlocks.rawHandlingMod.PhrasingContentSchema = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[typingsSlinky.wordpressBlocks.rawHandlingMod.PhrasingContentSchema]
  
  @scala.inline
  def getPossibleBlockTransformations(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.Block[typingsSlinky.std.Record[java.lang.String, _]]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.Block[typingsSlinky.std.Record[java.lang.String, _]]
  ]]
  
  @scala.inline
  def getSaveContent[T](blockTypeOrName: java.lang.String, attributes: T): java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getSaveContent[T](
    blockTypeOrName: java.lang.String,
    attributes: T,
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getSaveContent[T](blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[T], attributes: T): java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getSaveContent[T](
    blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[T],
    attributes: T,
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): java.lang.String = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getSaveElement[T](blockTypeOrName: java.lang.String, attributes: T): typingsSlinky.react.mod.ReactChild = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.react.mod.ReactChild]
  @scala.inline
  def getSaveElement[T](
    blockTypeOrName: java.lang.String,
    attributes: T,
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.react.mod.ReactChild = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.react.mod.ReactChild]
  @scala.inline
  def getSaveElement[T](blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[T], attributes: T): typingsSlinky.react.mod.ReactChild = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.react.mod.ReactChild]
  @scala.inline
  def getSaveElement[T](
    blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[T],
    attributes: T,
    innerBlocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): typingsSlinky.react.mod.ReactChild = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.react.mod.ReactChild]
  
  @scala.inline
  def getUnregisteredTypeHandlerName(): js.UndefOr[java.lang.String] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredTypeHandlerName")().asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def hasBlockSupport_align(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_align(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_align(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_align(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.align,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_alignWide(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.alignWide,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_anchor(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_anchor(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_anchor(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_anchor(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.anchor,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_className(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_className(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_className(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_className(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.className,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_customClassName(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.customClassName,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_html(nameOrType: java.lang.String, feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_html(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_html(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_html(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_inserter(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_inserter(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_inserter(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_inserter(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.inserter,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_multiple(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_multiple(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_multiple(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_multiple(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.multiple,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasBlockSupport_reusable(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_reusable(
    nameOrType: java.lang.String,
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_reusable(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasBlockSupport_reusable(
    nameOrType: typingsSlinky.wordpressBlocks.mod.Block[_],
    feature: typingsSlinky.wordpressBlocks.wordpressBlocksStrings.reusable,
    defaultSupports: scala.Boolean
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasChildBlocks(blockName: java.lang.String): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasChildBlocksWithInserterSupport(blockName: java.lang.String): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocksWithInserterSupport")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isReusableBlock(blockOrType: typingsSlinky.wordpressBlocks.mod.Block[_]): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isReusableBlock(
    blockOrType: typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isUnmodifiedDefaultBlock(
    block: typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidBlockContent[T](blockTypeOrName: java.lang.String, attributes: T, originalBlockContent: java.lang.String): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def isValidBlockContent[T](
    blockTypeOrName: typingsSlinky.wordpressBlocks.mod.Block[T],
    attributes: T,
    originalBlockContent: java.lang.String
  ): scala.Boolean = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isValidIcon(icon: js.Any): scala.Boolean = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def normalizeIconObject(): typingsSlinky.wordpressBlocks.mod.BlockIconNormalized = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockIconNormalized]
  @scala.inline
  def normalizeIconObject(icon: typingsSlinky.wordpressBlocks.mod.BlockIcon): typingsSlinky.wordpressBlocks.mod.BlockIconNormalized = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.wordpressBlocks.mod.BlockIconNormalized]
  
  @scala.inline
  def parse(content: java.lang.String): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.anon.Attributetypeboolean): js.UndefOr[scala.Boolean] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute): js.UndefOr[java.lang.String] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Children): js.Array[typingsSlinky.react.mod.ReactChild] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.react.mod.ReactChild]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.HTML): js.UndefOr[java.lang.String] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Node): slinky.core.facade.ReactElement | scala.Null = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[slinky.core.facade.ReactElement | scala.Null]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Text): js.UndefOr[java.lang.String] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def parseWithAttributeSchema[T /* <: typingsSlinky.std.Record[java.lang.String, typingsSlinky.wordpressBlocks.parserMod.Source[_]] */](innerHTML: java.lang.String, schema: typingsSlinky.wordpressBlocks.parserMod.Schema.Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with org.scalablytyped.runtime.TopLevel[T] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with org.scalablytyped.runtime.TopLevel[T]]
  
  @scala.inline
  def pasteHandler(
    options: typingsSlinky.wordpressBlocks.rawHandlingMod.pasteHandler.Options with typingsSlinky.wordpressBlocks.anon.Mode
  ): java.lang.String = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def rawHandler(options: typingsSlinky.wordpressBlocks.anon.HTML): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  
  @scala.inline
  def registerBlockCollection(namespace: java.lang.String, settings: typingsSlinky.wordpressBlocks.anon.Icon): scala.Unit = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerBlockStyle(blockName: java.lang.String, styleVariation: typingsSlinky.wordpressBlocks.mod.BlockStyle): scala.Unit = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerBlockType[T /* <: typingsSlinky.std.Record[java.lang.String, _] */](name: java.lang.String, settings: typingsSlinky.wordpressBlocks.mod.BlockConfiguration[T]): js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[T]]]
  
  @scala.inline
  def serialize(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): java.lang.String = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def setCategories(categories: js.Array[typingsSlinky.wordpressBlocks.categoriesMod.Category]): scala.Unit = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setDefaultBlockName(name: java.lang.String): scala.Unit = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setFreeformContentHandlerName(blockName: java.lang.String): scala.Unit = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setGroupingBlockName(name: java.lang.String): scala.Unit = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setUnregisteredTypeHandlerName(blockName: java.lang.String): scala.Unit = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def switchToBlockType(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ],
    name: java.lang.String
  ): (js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]) | scala.Null = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]) | scala.Null]
  @scala.inline
  def switchToBlockType(
    blocks: typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]],
    name: java.lang.String
  ): (js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]) | scala.Null = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]) | scala.Null]
  
  @scala.inline
  def synchronizeBlocksWithTemplate(): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  @scala.inline
  def synchronizeBlocksWithTemplate(
    blocks: js.UndefOr[scala.Nothing],
    template: typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  @scala.inline
  def synchronizeBlocksWithTemplate(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  @scala.inline
  def synchronizeBlocksWithTemplate(
    blocks: js.Array[
      typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
    ],
    template: typingsSlinky.wordpressBlocks.templatesMod.TemplateArray
  ): js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ] = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsSlinky.wordpressBlocks.mod.BlockInstance[org.scalablytyped.runtime.StringDictionary[_]]
  ]]
  
  @scala.inline
  def unregisterBlockStyle(blockName: java.lang.String, styleVariationName: java.lang.String): scala.Unit = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unregisterBlockType(name: java.lang.String): js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[_]] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsSlinky.wordpressBlocks.mod.Block[_]]]
  
  @scala.inline
  def updateCategory(slug: java.lang.String, category: typingsSlinky.wordpressBlocks.anon.PartialCategory): scala.Unit = (typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def withBlockContentContext[T /* <: slinky.core.ReactComponentClass[_] */](wrapped: T): slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[_, typingsSlinky.wordpressBlocks.wordpressBlocksStrings.BlockContent]
  ] = typingsSlinky.wordpressBlocks.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(wrapped.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.std.Omit[_, typingsSlinky.wordpressBlocks.wordpressBlocksStrings.BlockContent]
  ]]
}
