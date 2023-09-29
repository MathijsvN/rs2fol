import controller.Transformer
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.comparables.shouldBeEqualComparingTo
import parser.RDFSurfacesParser
import rdfSurfaces.IRI
import kotlin.io.path.Path
import kotlin.io.path.absolute
import kotlin.io.path.invariantSeparatorsPathString
import kotlin.io.path.readText

class RDFSurfaceToFOLControllerTest : ShouldSpec(
    {
        val rdfSurfacesParser = RDFSurfacesParser(false)

        should("transform example2.n3 without exception") {
            val file = Path("src/test/resources/turtle/example2.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example2.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example3.n3 without exception") {
            val file = Path("src/test/resources/turtle/example3.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example3.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example4.n3 without exception") {
            val file = Path("src/test/resources/turtle/example4.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example4.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example5.n3 without exception") {
            val file = Path("src/test/resources/turtle/example5.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example5.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example6.n3 without exception") {
            val file = Path("src/test/resources/turtle/example6.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example6.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example7.n3 without exception") {
            val file = Path("src/test/resources/turtle/example7.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example7.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example8.n3 without exception") {
            val file = Path("src/test/resources/turtle/example8.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example8.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example9.n3 without exception") {
            val file = Path("src/test/resources/turtle/example9.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example9.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example10.n3 without exception") {
            val file = Path("src/test/resources/turtle/example10.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example10.p")
            println(
                (Transformer().toFOL(
                    rdfSurfacesParser.parseToEnd(
                        file.readText(),
                        IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                    )
                ))
            )
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example11.n3 without exception") {
            val file = Path("src/test/resources/turtle/example11.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example11.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example12.n3 without exception") {
            val file = Path("src/test/resources/turtle/example12.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example12.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example13.n3 without exception") {
            val file = Path("src/test/resources/turtle/example13.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example13.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example14.n3 without exception") {
            val file = Path("src/test/resources/turtle/example14.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example14.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example15.n3 without exception") {
            val file = Path("src/test/resources/turtle/example15.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example15.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example16.n3 without exception") {
            val file = Path("src/test/resources/turtle/example16.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example16.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example17.n3 without exception") {
            val file = Path("src/test/resources/turtle/example17.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example17.p")
            //TODO(absolutePath)
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example20.n3 without exception") {
            val file = Path("src/test/resources/turtle/example20.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example20.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example21.n3 without exception") {
            val file = Path("src/test/resources/turtle/example21.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example21.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")

        }
        should("transform example22.n3 without exception") {
            val file = Path("src/test/resources/turtle/example22.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example22.p")

            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )) shouldBeEqualComparingTo solutionFile.readText()
        }
        should("transform example23.n3 without exception") {
            val file = Path("src/test/resources/turtle/example23.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example23.p")

            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example24.n3 without exception") {
            val file = Path("src/test/resources/turtle/example24.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example24.p")
            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example25.n3 without exception") {
            val file = Path("src/test/resources/turtle/example25.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example25.p")

            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }
        should("transform example26.n3 without exception") {
            val file = Path("src/test/resources/turtle/example26.n3")
            val solutionFile = Path("src/test/resources/turtle-fol/example26.p")

            (Transformer().toFOL(
                rdfSurfacesParser.parseToEnd(
                    file.readText(),
                    IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                )
            )).replace(
                "\\s".toRegex(),
                ""
            ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
        }


        context("blogic") {
            should("transform blogic abc.n3") {
                val file = Path("src/test/resources/blogic/abc.n3")
                val solutionFile = Path("src/test/resources/blogic-fol/abc-fol.p")

                Transformer().toFOL(
                    rdfSurfacesParser.parseToEnd(
                        file.readText(),
                        IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                    )
                ).replace("\\s+".toRegex(), "") shouldBeEqualComparingTo solutionFile.readText().replace("\\s+".toRegex(), "")
            }
            should("transform blogic abcd.n3") {
                val file = Path("src/test/resources/blogic/abcd.n3")
                val solutionFile = Path("src/test/resources/blogic-fol/abcd-fol.p")

                Transformer().toFOL(
                    rdfSurfacesParser.parseToEnd(
                        file.readText(),
                        IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                    )
                ).replace("\\s+".toRegex(), "") shouldBeEqualComparingTo solutionFile.readText().replace("\\s+".toRegex(), "")
            }
        }
        context("lists") {
            should("transform lists.n3 without exception") {
                val file = Path("src/test/resources/turtle/lists.n3")
                val solutionFile = Path("src/test/resources/turtle-fol/lists.p")
                (Transformer().toFOL(
                    rdfSurfacesParser.parseToEnd(
                        file.readText(),
                        IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                    )
                )).replace(
                    "\\s".toRegex(),
                    ""
                ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
            }
            should("transform lists.n3 without exception (with RDF first-rest chains)") {
                val file = Path("src/test/resources/turtle/lists.n3")
                val solutionFile = Path("src/test/resources/turtle-fol/lists-rdf.p")
                (Transformer().toFOL(
                    RDFSurfacesParser(useRDFLists = true).parseToEnd(
                        file.readText(),
                        IRI.from("file://" + file.absolute().parent.invariantSeparatorsPathString + "/")
                    )
                )).replace(
                    "\\s".toRegex(),
                    ""
                ) shouldBeEqualComparingTo solutionFile.readText().replace("\\s".toRegex(), "")
            }
        }
    })