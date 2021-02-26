package typingsSlinky.solidityParserAntlr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(sourceCode: java.lang.String, parserOpts: typingsSlinky.solidityParserAntlr.mod.ParserOpts): typingsSlinky.solidityParserAntlr.mod.ASTNode = (typingsSlinky.solidityParserAntlr.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sourceCode.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ASTNode]
  
  @scala.inline
  def visit(
    ast: typingsSlinky.solidityParserAntlr.mod.ASTNode,
    visitor: typingsSlinky.solidityParserAntlr.mod.Visitor
  ): scala.Unit = (typingsSlinky.solidityParserAntlr.mod.^.asInstanceOf[js.Dynamic].applyDynamic("visit")(ast.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
