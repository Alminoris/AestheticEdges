package net.alminoris.aestheticedges.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticedges:block/NAME" },
                "facing=south": { "model": "aestheticedges:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticedges:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticedges:block/NAME", "y": 90 }
              }
            }
            """;

    public static String CURBSTONE_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [16, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [16, 8, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 4],
            			"to": [16, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"up": {"uv": [16, 10, 0, 6], "texture": "#0"},
            				"down": {"uv": [16, 6, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String CURBSTONE_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [16, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [16, 8, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4],
            			"to": [16, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"east": {"uv": [4, 0, 16, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"west": {"uv": [4, 0, 16, 8], "texture": "#0"},
            				"up": {"uv": [12, 12, 0, 8], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [12, 8, 0, 12], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 4],
            			"to": [12, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"up": {"uv": [12, 10, 0, 6], "texture": "#0"},
            				"down": {"uv": [12, 6, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 8],
            			"to": [12, 5.5, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 8]},
            			"faces": {
            				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"up": {"uv": [8, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [8, 6, 0, 10], "rotation": 270, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String CURBSTONE_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [12, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [8, 0, 12, 8], "texture": "#0"},
            				"south": {"uv": [4, 0, 8, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [8, 8, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4],
            			"to": [16, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
            			"faces": {
            				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [4, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"west": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"up": {"uv": [4, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [8, 6, 4, 10], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 0],
            			"to": [12, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 0]},
            			"faces": {
            				"north": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"up": {"uv": [8, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [16, 6, 8, 10], "rotation": 270, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 3, 2],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 2],
            			"to": [16, 1, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.025, -0.1, 2.1],
            			"to": [16.025, 2.4, 3.1],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [0.1, -0.1, 1.1]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 0.001, 0],
             			"to": [16, 3.001, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0.1, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.025, -0.1, 2.1],
             			"to": [15.925, 2.4, 3.1],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [0.1, -0.1, 1.1]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0.001, 2],
             			"to": [15.9, 1.001, 3.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 1.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.975, 0, -0.025],
             			"to": [15.975, 3.0001, 15.975],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 2], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 2], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.26162, 0.28522, 0.25],
             			"to": [14.26162, 2.78522, 16],
             			"rotation": {"angle": -22.5, "axis": "z", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.475, 0.0001, 0.075],
             			"to": [13.975, 1.0001, 15.975],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.16444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1.5], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1.5], "rotation": 270, "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [14, 0, 0],
             			"to": [16, 3, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.22329, 0.47799, -0.0001],
             			"to": [14.22329, 2.97799, 1.9999],
             			"rotation": {"angle": -22.5, "axis": "z", "origin": [13.59627, 1.06449, 1.41235]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 1], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 1], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.475, 0.0001, -0.0002],
             			"to": [14.075, 1.0001, 3.4998],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.59627, 1.06449, 1.41235]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 3, 1.5], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 3, 1.5], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.98382, 0.47799, 1.475],
             			"to": [16.00882, 2.87799, 2.475],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [14.55882, 1.72799, 1.93533]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.975, -0.0001, 2],
             			"to": [16.001, 1, 3.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.59627, 1.06449, 2.31235]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2.1], "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2.1], "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"texture_size": [32, 32],
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [16, 16, 5],
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 5, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
             				"up": {"uv": [16, 13, 0, 8], "texture": "#0"},
             				"down": {"uv": [16, 8, 0, 13], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 5],
             			"to": [16, 13.5, 8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [16, 9, 0, 6], "texture": "#0"},
             				"down": {"uv": [16, 6, 0, 9], "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
               	"texture_size": [32, 32],
               	"textures": {
               		"0": "NAME",
               		"particle": "NAME"
               	},
               	"elements": [
               		{
               			"from": [0, 0, 0],
               			"to": [16, 16, 5],
               			"faces": {
               				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
               				"east": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
               				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"up": {"uv": [16, 13, 0, 8], "texture": "#0"},
               				"down": {"uv": [16, 8, 0, 13], "texture": "#0"}
               			}
               		},
               		{
               			"from": [11, 0, 5],
               			"to": [16, 16, 16],
               			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
               			"faces": {
               				"north": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"east": {"uv": [5, 0, 16, 16], "texture": "#0"},
               				"south": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"west": {"uv": [5, 0, 16, 16], "texture": "#0"},
               				"up": {"uv": [11, 13, 0, 8], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [11, 8, 0, 13], "rotation": 270, "texture": "#0"}
               			}
               		},
               		{
               			"from": [0, 0, 5],
               			"to": [11, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
               			"faces": {
               				"north": {"uv": [0, 0, 11, 14], "texture": "#0"},
               				"east": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"south": {"uv": [0, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"up": {"uv": [11, 9, 0, 6], "texture": "#0"},
               				"down": {"uv": [11, 6, 0, 9], "texture": "#0"}
               			}
               		},
               		{
               			"from": [8, 0, 8],
               			"to": [11, 13.5, 16],
               			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 8]},
               			"faces": {
               				"north": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"east": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"up": {"uv": [8, 9, 0, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [8, 6, 0, 9], "rotation": 270, "texture": "#0"}
               			}
               		}
               	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
               	"texture_size": [32, 32],
               	"textures": {
               		"0": "NAME",
               		"particle": "NAME"
               	},
               	"elements": [
               		{
               			"from": [11, 0, 0],
               			"to": [16, 16, 5],
               			"faces": {
               				"north": {"uv": [11, 0, 16, 16], "texture": "#0"},
               				"east": {"uv": [7, 0, 12, 16], "texture": "#0"},
               				"south": {"uv": [3, 0, 8, 16], "texture": "#0"},
               				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"up": {"uv": [5, 13, 0, 8], "texture": "#0"},
               				"down": {"uv": [8, 8, 3, 13], "texture": "#0"}
               			}
               		},
               		{
               			"from": [11, 0, 5],
               			"to": [16, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
               			"faces": {
               				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
               				"east": {"uv": [5, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [0, 0, 5, 14], "texture": "#0"},
               				"west": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"up": {"uv": [4, 11, 1, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [7, 6, 4, 11], "rotation": 270, "texture": "#0"}
               			}
               		},
               		{
               			"from": [8, 0, 0],
               			"to": [11, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 0]},
               			"faces": {
               				"north": {"uv": [12, 0, 15, 14], "texture": "#0"},
               				"east": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"up": {"uv": [8, 9, 0, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [16, 6, 8, 9], "rotation": 270, "texture": "#0"}
               			}
               		}
               	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 4, 4]},
            			"faces": {
            				"north": {"uv": [0, 8, 16, 16], "texture": "#0"},
            				"east": {"uv": [4, 4, 12, 12], "texture": "#0"},
            				"south": {"uv": [0, 8, 16, 16], "texture": "#0"},
            				"west": {"uv": [4, 4, 12, 12], "texture": "#0"},
            				"up": {"uv": [16, 8, 0, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 8], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_INNER_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
              	"textures": {
              		"0": "NAME",
              		"particle": "NAME"
              	},
              	"elements": [
              		{
              			"from": [0, 0, 0],
              			"to": [16, 8, 8],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 4, 4]},
              			"faces": {
              				"north": {"uv": [0, 8, 16, 16], "texture": "#0"},
              				"east": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"south": {"uv": [0, 8, 16, 16], "texture": "#0"},
              				"west": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
              			}
              		},
              		{
              			"from": [8, 0, 8],
              			"to": [16, 8, 16],
              			"rotation": {"angle": 0, "axis": "y", "origin": [12, 4, 12]},
              			"faces": {
              				"north": {"uv": [0, 0, 8, 8], "texture": "#missing"},
              				"east": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"south": {"uv": [0, 0, 8, 8], "texture": "#0"},
              				"west": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"down": {"uv": [0, 8, 8, 16], "texture": "#0"}
              			}
              		}
              	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_OUTER_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
              	"textures": {
              		"0": "NAME",
              		"particle": "NAME"
              	},
              	"elements": [
              		{
              			"from": [8, 0, 0],
              			"to": [16, 8, 8],
              			"rotation": {"angle": 0, "axis": "y", "origin": [12, 4, 4]},
              			"faces": {
              				"north": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"east": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"south": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"west": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"down": {"uv": [8, 0, 16, 8], "texture": "#0"}
              			}
              		}
              	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String STONECUTTING_RECIPE = """
            {
              "type": "minecraft:stonecutting",
              "ingredient": {
                "item": "INGREDIENT_NAME"
              },
              "result": {
                "count": COUNT,
                "id": "aestheticedges:OUTPUT_NAME"
              }
            }
            """;
    
    public static String CURTAIN_ROD = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CURTAIN_ROD_LEFT = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CURTAIN_ROD_RIGHT = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CURTAIN_ROD_CENTER = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 0, 6], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	}
            }
            """;

    public static String CURTAIN_ROD_DRESSED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -12, 1.5],
            			"to": [16, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [3, 0, 11, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 11, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8.25, -13, 1.5],
            			"to": [16, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"south": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"up": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 10.75, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -14, 1.5],
            			"to": [16, -13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -2, 2]},
            			"faces": {
            				"north": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"east": {"uv": [1, 1, 2, 2], "texture": "#1"},
            				"south": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"west": {"uv": [1, 1, 2, 2], "texture": "#1"},
            				"up": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"down": {"uv": [3, 1, 10, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [10.75, -16, 1.5],
            			"to": [16, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"east": {"uv": [1, 3, 2, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"west": {"uv": [1, 3, 2, 4], "texture": "#1"},
            				"up": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"down": {"uv": [3, 3, 8.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [10, -15, 1.5],
            			"to": [16, -14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, 0, 2]},
            			"faces": {
            				"north": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"east": {"uv": [1, 2, 2, 3], "texture": "#1"},
            				"south": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"west": {"uv": [1, 2, 2, 3], "texture": "#1"},
            				"up": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"down": {"uv": [3, 2, 9, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8, 13, 1.5],
            			"to": [15, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 7, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 13, 1.5],
            			"to": [8, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 7, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -12, 1.5],
            			"to": [8, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -13, 1.5],
            			"to": [7.75, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 12.75, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -14, 1.5],
            			"to": [7, -13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -2, 2]},
            			"faces": {
            				"north": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"east": {"uv": [2, 1, 3, 2], "texture": "#1"},
            				"south": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"west": {"uv": [2, 1, 3, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"down": {"uv": [5, 1, 12, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -16, 1.5],
            			"to": [5.25, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"east": {"uv": [2, 3, 3, 4], "texture": "#1"},
            				"south": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"west": {"uv": [2, 3, 3, 4], "texture": "#1"},
            				"up": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"down": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -15, 1.5],
            			"to": [6, -14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, 0, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"east": {"uv": [2, 2, 3, 3], "texture": "#1"},
            				"south": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"west": {"uv": [2, 2, 3, 3], "texture": "#1"},
            				"up": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"down": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7, 8]
            		},
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_LEFT_DRESSED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 13, 1.5],
            			"to": [8, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 7, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -12, 1.5],
            			"to": [8, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -13, 1.5],
            			"to": [7.75, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [5, 0, 12.75, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 12.75, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -14, 1.5],
            			"to": [7, -13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -2, 2]},
            			"faces": {
            				"north": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"east": {"uv": [2, 1, 3, 2], "texture": "#1"},
            				"south": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"west": {"uv": [2, 1, 3, 2], "texture": "#1"},
            				"up": {"uv": [5, 1, 12, 2], "texture": "#1"},
            				"down": {"uv": [5, 1, 12, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -16, 1.5],
            			"to": [5.25, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"east": {"uv": [2, 3, 3, 4], "texture": "#1"},
            				"south": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"west": {"uv": [2, 3, 3, 4], "texture": "#1"},
            				"up": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"},
            				"down": {"uv": [4.25, 3, 9.5, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -15, 1.5],
            			"to": [6, -14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, 0, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"east": {"uv": [2, 2, 3, 3], "texture": "#1"},
            				"south": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"west": {"uv": [2, 2, 3, 3], "texture": "#1"},
            				"up": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"},
            				"down": {"uv": [4.25, 2, 10.25, 3], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_RIGHT_DRESSED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -12, 1.5],
            			"to": [16, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [3, 0, 11, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 11, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8.25, -13, 1.5],
            			"to": [16, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"south": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"up": {"uv": [3, 0, 10.75, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 10.75, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, -14, 1.5],
            			"to": [16, -13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -2, 2]},
            			"faces": {
            				"north": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"east": {"uv": [1, 1, 2, 2], "texture": "#1"},
            				"south": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"west": {"uv": [1, 1, 2, 2], "texture": "#1"},
            				"up": {"uv": [3, 1, 10, 2], "texture": "#1"},
            				"down": {"uv": [3, 1, 10, 2], "texture": "#1"}
            			}
            		},
            		{
            			"from": [10.75, -16, 1.5],
            			"to": [16, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"east": {"uv": [1, 3, 2, 4], "texture": "#1"},
            				"south": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"west": {"uv": [1, 3, 2, 4], "texture": "#1"},
            				"up": {"uv": [3, 3, 8.25, 4], "texture": "#1"},
            				"down": {"uv": [3, 3, 8.25, 4], "texture": "#1"}
            			}
            		},
            		{
            			"from": [10, -15, 1.5],
            			"to": [16, -14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, 0, 2]},
            			"faces": {
            				"north": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"east": {"uv": [1, 2, 2, 3], "texture": "#1"},
            				"south": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"west": {"uv": [1, 2, 2, 3], "texture": "#1"},
            				"up": {"uv": [3, 2, 9, 3], "texture": "#1"},
            				"down": {"uv": [3, 2, 9, 3], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8, 13, 1.5],
            			"to": [15, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 7, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_CENTER_DRESSED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, -12, 1.5],
            			"to": [16, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [3, 0, 11, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [3, 0, 11, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 11, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [8, 13, 1.5],
            			"to": [16, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13, 1.5],
            			"to": [8, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -12, 1.5],
            			"to": [8, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [1, 2]
            		},
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [3, 4]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_DRESSED_OPENED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17.25702, 4.31696, 1.475],
            			"to": [18.25702, 14.31696, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 10], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 10], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 10], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 10], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.5, -12, 1.5],
            			"to": [16, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 5.5, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [3, 0, 5.5, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [3, 0, 5.5, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 5.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, -15, 1.5],
            			"to": [16, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 5, 3], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 3], "texture": "#1"},
            				"south": {"uv": [3, 0, 5, 3], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 3], "texture": "#1"},
            				"up": {"uv": [3, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.75, -16, 1.5],
            			"to": [16, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"south": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"up": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 4.25, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.17751, -0.44889, 1.475],
            			"to": [15.27751, 15.55111, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2.1, 16], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 16], "texture": "#1"},
            				"south": {"uv": [1, 0, 2.1, 16], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 16], "texture": "#1"},
            				"up": {"uv": [1, 0, 2.1, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2.1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.26385, 1.72835, 1.475],
            			"to": [17.26385, 14.72835, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 13], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 13], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 13], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 13], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [18.25975, 6.92867, 1.475],
            			"to": [19.25975, 13.92867, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 7], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 7], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15.27068, 0.13973, 1.475],
            			"to": [16.27068, 15.13973, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 15], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 15], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 15], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 15], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 13, 1.5],
            			"to": [15, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [1, 13, 1.5],
            			"to": [7, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3.25975, 6.92867, 1.475],
            			"to": [-2.25975, 13.92867, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 7], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -12, 1.5],
            			"to": [2.5, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 2.5, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2.5, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.25702, 4.31696, 1.475],
            			"to": [-1.25702, 14.31696, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 10], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 10], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 10], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 10], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.26385, 1.72835, 1.475],
            			"to": [-0.26385, 14.72835, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 13], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 13], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 13], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 13], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-0.27068, 0.13973, 1.475],
            			"to": [0.72932, 15.13973, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.72249, -0.44889, 1.475],
            			"to": [1.82249, 15.55111, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1.1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1.1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1.1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -15, 1.5],
            			"to": [2, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [5, 0, 7, 3], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 3], "texture": "#1"},
            				"south": {"uv": [5, 0, 7, 3], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 3], "texture": "#1"},
            				"up": {"uv": [5, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 7, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -16, 1.5],
            			"to": [1.25, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"down": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		2,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [3, 4, 5, 6, 7, 8, 9, 10, 11]
            		},
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [12, 13, 14, 15, 16, 17, 18, 19, 20]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_LEFT_DRESSED_OPENED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [1, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [1, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 1, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 1, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13, 0],
            			"to": [1, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 13, 1.5],
            			"to": [7, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-3.25975, 6.92867, 1.475],
            			"to": [-2.25975, 13.92867, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 7], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 7], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 7], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -12, 1.5],
            			"to": [2.5, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 2.5, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 2.5, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 2.5, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 2.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-2.25702, 4.31696, 1.475],
            			"to": [-1.25702, 14.31696, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 10], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 10], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 10], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 10], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-1.26385, 1.72835, 1.475],
            			"to": [-0.26385, 14.72835, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 13], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 13], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 13], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 13], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [-0.27068, 0.13973, 1.475],
            			"to": [0.72932, 15.13973, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 15], "texture": "#1"},
            				"south": {"uv": [0, 0, 1, 15], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 15], "texture": "#1"},
            				"up": {"uv": [0, 0, 1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0.72249, -0.44889, 1.475],
            			"to": [1.82249, 15.55111, 2.525],
            			"rotation": {"angle": -22.5, "axis": "z", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 1.1, 16], "texture": "#1"},
            				"east": {"uv": [0, 0, 1.05, 16], "texture": "#1"},
            				"south": {"uv": [0, 0, 1.1, 16], "texture": "#1"},
            				"west": {"uv": [0, 0, 1.05, 16], "texture": "#1"},
            				"up": {"uv": [0, 0, 1.1, 1.05], "texture": "#1"},
            				"down": {"uv": [0, 0, 1.1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -15, 1.5],
            			"to": [2, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [5, 0, 7, 3], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 3], "texture": "#1"},
            				"south": {"uv": [5, 0, 7, 3], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 3], "texture": "#1"},
            				"up": {"uv": [5, 0, 7, 1], "texture": "#1"},
            				"down": {"uv": [5, 0, 7, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, -16, 1.5],
            			"to": [1.25, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"east": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"south": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"west": {"uv": [2, 0, 3, 1], "texture": "#1"},
            				"up": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"},
            				"down": {"uv": [4.25, 0, 5.5, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_RIGHT_DRESSED_OPENED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [15, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 15, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [15, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [15, 3, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [15, 13, 0],
            			"to": [16, 18, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [15.5, 15.5, 2]},
            			"faces": {
            				"north": {"uv": [7, 9, 8, 14], "texture": "#0"},
            				"east": {"uv": [3, 6, 7, 11], "texture": "#0"},
            				"south": {"uv": [7, 4, 8, 9], "texture": "#0"},
            				"west": {"uv": [8, 6, 12, 11], "texture": "#0"},
            				"up": {"uv": [3, 11, 2, 7], "texture": "#0"},
            				"down": {"uv": [13, 7, 12, 11], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17.25702, 4.31696, 1.475],
            			"to": [18.25702, 14.31696, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 10], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 10], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 10], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 10], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [13.5, -12, 1.5],
            			"to": [16, 13, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 5.5, 16], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"south": {"uv": [3, 0, 5.5, 16], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 16], "texture": "#1"},
            				"up": {"uv": [3, 0, 5.5, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 5.5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14, -15, 1.5],
            			"to": [16, -12, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 5, 3], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 3], "texture": "#1"},
            				"south": {"uv": [3, 0, 5, 3], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 3], "texture": "#1"},
            				"up": {"uv": [3, 0, 5, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 5, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.75, -16, 1.5],
            			"to": [16, -15, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"east": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"south": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"west": {"uv": [1, 0, 2, 1], "texture": "#1"},
            				"up": {"uv": [3, 0, 4.25, 1], "texture": "#1"},
            				"down": {"uv": [3, 0, 4.25, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [14.17751, -0.44889, 1.475],
            			"to": [15.27751, 15.55111, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2.1, 16], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 16], "texture": "#1"},
            				"south": {"uv": [1, 0, 2.1, 16], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 16], "texture": "#1"},
            				"up": {"uv": [1, 0, 2.1, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2.1, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [16.26385, 1.72835, 1.475],
            			"to": [17.26385, 14.72835, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 13], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 13], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 13], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 13], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [18.25975, 6.92867, 1.475],
            			"to": [19.25975, 13.92867, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 7], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 7], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 7], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 7], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [15.27068, 0.13973, 1.475],
            			"to": [16.27068, 15.13973, 2.525],
            			"rotation": {"angle": 22.5, "axis": "z", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [1, 0, 2, 15], "texture": "#1"},
            				"east": {"uv": [1.05, 0, 2.1, 15], "texture": "#1"},
            				"south": {"uv": [1, 0, 2, 15], "texture": "#1"},
            				"west": {"uv": [1.05, 0, 2.1, 15], "texture": "#1"},
            				"up": {"uv": [1, 0, 2, 1.05], "texture": "#1"},
            				"down": {"uv": [1, 0, 2, 1.05], "texture": "#1"}
            			}
            		},
            		{
            			"from": [9, 13, 1.5],
            			"to": [15, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 6, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 6, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		1,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [2, 3, 4, 5, 6, 7, 8, 9, 10]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_CENTER_DRESSED_OPENED = """
            {
            	"format_version": "1.9.0",
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"1": "minecraft:block/COLOR_NAME_wool",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 14, 0],
            			"to": [16, 17, 3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 15.5, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"east": {"uv": [2, 9, 5, 12], "texture": "#0"},
            				"south": {"uv": [0, 6, 16, 9], "texture": "#0"},
            				"west": {"uv": [11, 9, 14, 12], "texture": "#0"},
            				"up": {"uv": [16, 6, 0, 3], "texture": "#0"},
            				"down": {"uv": [16, 3, 0, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 13, 1.5],
            			"to": [16, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.36314, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		},
            		{
            			"from": [0, 13, 1.5],
            			"to": [8, 14, 2.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.63686, -1, 2]},
            			"faces": {
            				"north": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"east": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"south": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"west": {"uv": [0, 0, 1, 1], "texture": "#1"},
            				"up": {"uv": [0, 0, 8, 1], "texture": "#1"},
            				"down": {"uv": [0, 0, 8, 1], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0.5, -3.5, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0.5, -2.75, 3.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, -3.5, 4.5],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [30, -45, 0],
            			"translation": [-2, -3.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, -180, 0],
            			"translation": [0, -1.5, -3],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		0,
            		{
            			"name": "curtain_right",
            			"origin": [13.47442, 10.21309, 2],
            			"color": 0,
            			"children": [1]
            		},
            		{
            			"name": "curtain_left",
            			"origin": [0, 13.5, 2],
            			"color": 0,
            			"children": [2]
            		}
            	]
            }
            """;

    public static String CURTAIN_ROD_BLOCKSTATE = """
            {
              "variants":
              {
                "facing=north,color=black,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=black,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=black,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=black,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=black,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=black,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=black,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=black,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=black,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=black,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=black,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=black,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=black,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=black,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=black,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=black,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=black,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black" },
                "facing=south,color=black,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black", "y": 180 },
                "facing=west,color=black,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black", "y": 270 },
                "facing=east,color=black,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black", "y": 90 },
                "facing=north,color=black,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black" },
                "facing=south,color=black,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black", "y": 180 },
                "facing=west,color=black,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black", "y": 270 },
                "facing=east,color=black,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black", "y": 90 },
                "facing=north,color=black,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black" },
                "facing=south,color=black,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black", "y": 180 },
                "facing=west,color=black,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black", "y": 270 },
                "facing=east,color=black,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black", "y": 90 },
                "facing=north,color=black,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black" },
                "facing=south,color=black,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black", "y": 180 },
                "facing=west,color=black,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black", "y": 270 },
                "facing=east,color=black,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black", "y": 90 },
                "facing=north,color=black,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black_opened" },
                "facing=south,color=black,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black_opened", "y": 180 },
                "facing=west,color=black,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black_opened", "y": 270 },
                "facing=east,color=black,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_black_opened", "y": 90 },
                "facing=north,color=black,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black_opened" },
                "facing=south,color=black,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black_opened", "y": 180 },
                "facing=west,color=black,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black_opened", "y": 270 },
                "facing=east,color=black,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_black_opened", "y": 90 },
                "facing=north,color=black,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black_opened" },
                "facing=south,color=black,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black_opened", "y": 180 },
                "facing=west,color=black,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black_opened", "y": 270 },
                "facing=east,color=black,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_black_opened", "y": 90 },
                "facing=north,color=black,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black_opened" },
                "facing=south,color=black,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black_opened", "y": 180 },
                "facing=west,color=black,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black_opened", "y": 270 },
                "facing=east,color=black,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_black_opened", "y": 90 },
                "facing=north,color=black,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=black,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=black,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=black,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=black,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=black,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=black,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=black,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=black,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=black,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=black,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=black,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=black,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=black,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=black,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=black,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=brown,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=brown,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=brown,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=brown,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=brown,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=brown,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=brown,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=brown,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=brown,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=brown,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=brown,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=brown,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=brown,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=brown,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=brown,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=brown,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=brown,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown" },
                "facing=south,color=brown,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown", "y": 180 },
                "facing=west,color=brown,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown", "y": 270 },
                "facing=east,color=brown,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown", "y": 90 },
                "facing=north,color=brown,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown" },
                "facing=south,color=brown,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown", "y": 180 },
                "facing=west,color=brown,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown", "y": 270 },
                "facing=east,color=brown,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown", "y": 90 },
                "facing=north,color=brown,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown" },
                "facing=south,color=brown,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown", "y": 180 },
                "facing=west,color=brown,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown", "y": 270 },
                "facing=east,color=brown,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown", "y": 90 },
                "facing=north,color=brown,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown" },
                "facing=south,color=brown,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown", "y": 180 },
                "facing=west,color=brown,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown", "y": 270 },
                "facing=east,color=brown,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown", "y": 90 },
                "facing=north,color=brown,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown_opened" },
                "facing=south,color=brown,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown_opened", "y": 180 },
                "facing=west,color=brown,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown_opened", "y": 270 },
                "facing=east,color=brown,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_brown_opened", "y": 90 },
                "facing=north,color=brown,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown_opened" },
                "facing=south,color=brown,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown_opened", "y": 180 },
                "facing=west,color=brown,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown_opened", "y": 270 },
                "facing=east,color=brown,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_brown_opened", "y": 90 },
                "facing=north,color=brown,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown_opened" },
                "facing=south,color=brown,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown_opened", "y": 180 },
                "facing=west,color=brown,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown_opened", "y": 270 },
                "facing=east,color=brown,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_brown_opened", "y": 90 },
                "facing=north,color=brown,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown_opened" },
                "facing=south,color=brown,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown_opened", "y": 180 },
                "facing=west,color=brown,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown_opened", "y": 270 },
                "facing=east,color=brown,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_brown_opened", "y": 90 },
                "facing=north,color=brown,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=brown,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=brown,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=brown,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=brown,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=brown,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=brown,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=brown,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=brown,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=brown,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=brown,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=brown,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=brown,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=brown,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=brown,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=brown,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray" },
                "facing=south,color=gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray", "y": 180 },
                "facing=west,color=gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray", "y": 270 },
                "facing=east,color=gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray", "y": 90 },
                "facing=north,color=gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray" },
                "facing=south,color=gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray", "y": 180 },
                "facing=west,color=gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray", "y": 270 },
                "facing=east,color=gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray", "y": 90 },
                "facing=north,color=gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray" },
                "facing=south,color=gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray", "y": 180 },
                "facing=west,color=gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray", "y": 270 },
                "facing=east,color=gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray", "y": 90 },
                "facing=north,color=gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray" },
                "facing=south,color=gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray", "y": 180 },
                "facing=west,color=gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray", "y": 270 },
                "facing=east,color=gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray", "y": 90 },
                "facing=north,color=gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray_opened" },
                "facing=south,color=gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray_opened", "y": 180 },
                "facing=west,color=gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray_opened", "y": 270 },
                "facing=east,color=gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_gray_opened", "y": 90 },
                "facing=north,color=gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray_opened" },
                "facing=south,color=gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray_opened", "y": 180 },
                "facing=west,color=gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray_opened", "y": 270 },
                "facing=east,color=gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_gray_opened", "y": 90 },
                "facing=north,color=gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray_opened" },
                "facing=south,color=gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray_opened", "y": 180 },
                "facing=west,color=gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray_opened", "y": 270 },
                "facing=east,color=gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_gray_opened", "y": 90 },
                "facing=north,color=gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray_opened" },
                "facing=south,color=gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray_opened", "y": 180 },
                "facing=west,color=gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray_opened", "y": 270 },
                "facing=east,color=gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_gray_opened", "y": 90 },
                "facing=north,color=gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=light_gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=light_gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=light_gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=light_gray,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=light_gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=light_gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=light_gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=light_gray,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=light_gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=light_gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=light_gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=light_gray,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=light_gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=light_gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=light_gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=light_gray,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=light_gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray" },
                "facing=south,color=light_gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray", "y": 180 },
                "facing=west,color=light_gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray", "y": 270 },
                "facing=east,color=light_gray,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray", "y": 90 },
                "facing=north,color=light_gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray" },
                "facing=south,color=light_gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray", "y": 180 },
                "facing=west,color=light_gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray", "y": 270 },
                "facing=east,color=light_gray,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray", "y": 90 },
                "facing=north,color=light_gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray" },
                "facing=south,color=light_gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray", "y": 180 },
                "facing=west,color=light_gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray", "y": 270 },
                "facing=east,color=light_gray,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray", "y": 90 },
                "facing=north,color=light_gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray" },
                "facing=south,color=light_gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray", "y": 180 },
                "facing=west,color=light_gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray", "y": 270 },
                "facing=east,color=light_gray,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray", "y": 90 },
                "facing=north,color=light_gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray_opened" },
                "facing=south,color=light_gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray_opened", "y": 180 },
                "facing=west,color=light_gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray_opened", "y": 270 },
                "facing=east,color=light_gray,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_gray_opened", "y": 90 },
                "facing=north,color=light_gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray_opened" },
                "facing=south,color=light_gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray_opened", "y": 180 },
                "facing=west,color=light_gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray_opened", "y": 270 },
                "facing=east,color=light_gray,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_gray_opened", "y": 90 },
                "facing=north,color=light_gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray_opened" },
                "facing=south,color=light_gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray_opened", "y": 180 },
                "facing=west,color=light_gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray_opened", "y": 270 },
                "facing=east,color=light_gray,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_gray_opened", "y": 90 },
                "facing=north,color=light_gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray_opened" },
                "facing=south,color=light_gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray_opened", "y": 180 },
                "facing=west,color=light_gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray_opened", "y": 270 },
                "facing=east,color=light_gray,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_gray_opened", "y": 90 },
                "facing=north,color=light_gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=light_gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=light_gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=light_gray,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=light_gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=light_gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=light_gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=light_gray,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=light_gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=light_gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=light_gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=light_gray,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=light_gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=light_gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=light_gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=light_gray,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=white,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=white,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=white,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=white,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=white,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=white,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=white,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=white,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=white,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=white,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=white,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=white,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=white,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=white,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=white,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=white,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=white,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white" },
                "facing=south,color=white,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white", "y": 180 },
                "facing=west,color=white,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white", "y": 270 },
                "facing=east,color=white,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white", "y": 90 },
                "facing=north,color=white,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white" },
                "facing=south,color=white,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white", "y": 180 },
                "facing=west,color=white,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white", "y": 270 },
                "facing=east,color=white,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white", "y": 90 },
                "facing=north,color=white,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white" },
                "facing=south,color=white,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white", "y": 180 },
                "facing=west,color=white,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white", "y": 270 },
                "facing=east,color=white,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white", "y": 90 },
                "facing=north,color=white,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white" },
                "facing=south,color=white,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white", "y": 180 },
                "facing=west,color=white,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white", "y": 270 },
                "facing=east,color=white,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white", "y": 90 },
                "facing=north,color=white,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white_opened" },
                "facing=south,color=white,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white_opened", "y": 180 },
                "facing=west,color=white,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white_opened", "y": 270 },
                "facing=east,color=white,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_white_opened", "y": 90 },
                "facing=north,color=white,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white_opened" },
                "facing=south,color=white,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white_opened", "y": 180 },
                "facing=west,color=white,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white_opened", "y": 270 },
                "facing=east,color=white,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_white_opened", "y": 90 },
                "facing=north,color=white,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white_opened" },
                "facing=south,color=white,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white_opened", "y": 180 },
                "facing=west,color=white,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white_opened", "y": 270 },
                "facing=east,color=white,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_white_opened", "y": 90 },
                "facing=north,color=white,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white_opened" },
                "facing=south,color=white,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white_opened", "y": 180 },
                "facing=west,color=white,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white_opened", "y": 270 },
                "facing=east,color=white,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_white_opened", "y": 90 },
                "facing=north,color=white,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=white,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=white,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=white,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=white,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=white,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=white,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=white,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=white,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=white,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=white,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=white,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=white,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=white,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=white,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=white,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=red,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=red,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=red,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=red,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=red,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=red,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=red,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=red,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=red,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=red,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=red,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=red,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=red,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=red,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=red,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=red,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=red,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red" },
                "facing=south,color=red,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red", "y": 180 },
                "facing=west,color=red,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red", "y": 270 },
                "facing=east,color=red,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red", "y": 90 },
                "facing=north,color=red,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red" },
                "facing=south,color=red,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red", "y": 180 },
                "facing=west,color=red,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red", "y": 270 },
                "facing=east,color=red,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red", "y": 90 },
                "facing=north,color=red,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red" },
                "facing=south,color=red,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red", "y": 180 },
                "facing=west,color=red,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red", "y": 270 },
                "facing=east,color=red,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red", "y": 90 },
                "facing=north,color=red,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red" },
                "facing=south,color=red,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red", "y": 180 },
                "facing=west,color=red,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red", "y": 270 },
                "facing=east,color=red,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red", "y": 90 },
                "facing=north,color=red,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red_opened" },
                "facing=south,color=red,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red_opened", "y": 180 },
                "facing=west,color=red,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red_opened", "y": 270 },
                "facing=east,color=red,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_red_opened", "y": 90 },
                "facing=north,color=red,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red_opened" },
                "facing=south,color=red,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red_opened", "y": 180 },
                "facing=west,color=red,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red_opened", "y": 270 },
                "facing=east,color=red,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_red_opened", "y": 90 },
                "facing=north,color=red,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red_opened" },
                "facing=south,color=red,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red_opened", "y": 180 },
                "facing=west,color=red,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red_opened", "y": 270 },
                "facing=east,color=red,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_red_opened", "y": 90 },
                "facing=north,color=red,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red_opened" },
                "facing=south,color=red,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red_opened", "y": 180 },
                "facing=west,color=red,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red_opened", "y": 270 },
                "facing=east,color=red,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_red_opened", "y": 90 },
                "facing=north,color=red,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=red,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=red,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=red,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=red,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=red,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=red,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=red,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=red,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=red,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=red,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=red,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=red,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=red,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=red,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=red,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=orange,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=orange,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=orange,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=orange,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=orange,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=orange,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=orange,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=orange,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=orange,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=orange,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=orange,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=orange,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=orange,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=orange,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=orange,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=orange,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=orange,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange" },
                "facing=south,color=orange,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange", "y": 180 },
                "facing=west,color=orange,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange", "y": 270 },
                "facing=east,color=orange,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange", "y": 90 },
                "facing=north,color=orange,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange" },
                "facing=south,color=orange,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange", "y": 180 },
                "facing=west,color=orange,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange", "y": 270 },
                "facing=east,color=orange,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange", "y": 90 },
                "facing=north,color=orange,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange" },
                "facing=south,color=orange,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange", "y": 180 },
                "facing=west,color=orange,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange", "y": 270 },
                "facing=east,color=orange,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange", "y": 90 },
                "facing=north,color=orange,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange" },
                "facing=south,color=orange,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange", "y": 180 },
                "facing=west,color=orange,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange", "y": 270 },
                "facing=east,color=orange,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange", "y": 90 },
                "facing=north,color=orange,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange_opened" },
                "facing=south,color=orange,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange_opened", "y": 180 },
                "facing=west,color=orange,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange_opened", "y": 270 },
                "facing=east,color=orange,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_orange_opened", "y": 90 },
                "facing=north,color=orange,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange_opened" },
                "facing=south,color=orange,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange_opened", "y": 180 },
                "facing=west,color=orange,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange_opened", "y": 270 },
                "facing=east,color=orange,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_orange_opened", "y": 90 },
                "facing=north,color=orange,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange_opened" },
                "facing=south,color=orange,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange_opened", "y": 180 },
                "facing=west,color=orange,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange_opened", "y": 270 },
                "facing=east,color=orange,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_orange_opened", "y": 90 },
                "facing=north,color=orange,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange_opened" },
                "facing=south,color=orange,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange_opened", "y": 180 },
                "facing=west,color=orange,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange_opened", "y": 270 },
                "facing=east,color=orange,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_orange_opened", "y": 90 },
                "facing=north,color=orange,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=orange,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=orange,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=orange,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=orange,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=orange,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=orange,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=orange,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=orange,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=orange,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=orange,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=orange,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=orange,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=orange,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=orange,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=orange,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=yellow,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=yellow,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=yellow,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=yellow,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=yellow,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=yellow,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=yellow,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=yellow,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=yellow,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=yellow,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=yellow,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=yellow,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=yellow,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=yellow,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=yellow,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=yellow,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=yellow,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow" },
                "facing=south,color=yellow,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow", "y": 180 },
                "facing=west,color=yellow,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow", "y": 270 },
                "facing=east,color=yellow,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow", "y": 90 },
                "facing=north,color=yellow,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow" },
                "facing=south,color=yellow,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow", "y": 180 },
                "facing=west,color=yellow,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow", "y": 270 },
                "facing=east,color=yellow,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow", "y": 90 },
                "facing=north,color=yellow,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow" },
                "facing=south,color=yellow,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow", "y": 180 },
                "facing=west,color=yellow,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow", "y": 270 },
                "facing=east,color=yellow,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow", "y": 90 },
                "facing=north,color=yellow,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow" },
                "facing=south,color=yellow,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow", "y": 180 },
                "facing=west,color=yellow,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow", "y": 270 },
                "facing=east,color=yellow,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow", "y": 90 },
                "facing=north,color=yellow,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow_opened" },
                "facing=south,color=yellow,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow_opened", "y": 180 },
                "facing=west,color=yellow,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow_opened", "y": 270 },
                "facing=east,color=yellow,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_yellow_opened", "y": 90 },
                "facing=north,color=yellow,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow_opened" },
                "facing=south,color=yellow,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow_opened", "y": 180 },
                "facing=west,color=yellow,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow_opened", "y": 270 },
                "facing=east,color=yellow,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_yellow_opened", "y": 90 },
                "facing=north,color=yellow,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow_opened" },
                "facing=south,color=yellow,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow_opened", "y": 180 },
                "facing=west,color=yellow,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow_opened", "y": 270 },
                "facing=east,color=yellow,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_yellow_opened", "y": 90 },
                "facing=north,color=yellow,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow_opened" },
                "facing=south,color=yellow,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow_opened", "y": 180 },
                "facing=west,color=yellow,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow_opened", "y": 270 },
                "facing=east,color=yellow,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_yellow_opened", "y": 90 },
                "facing=north,color=yellow,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=yellow,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=yellow,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=yellow,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=yellow,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=yellow,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=yellow,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=yellow,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=yellow,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=yellow,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=yellow,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=yellow,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=yellow,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=yellow,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=yellow,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=yellow,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=purple,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=purple,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=purple,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=purple,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=purple,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=purple,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=purple,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=purple,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=purple,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=purple,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=purple,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=purple,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=purple,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=purple,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=purple,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=purple,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=purple,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple" },
                "facing=south,color=purple,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple", "y": 180 },
                "facing=west,color=purple,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple", "y": 270 },
                "facing=east,color=purple,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple", "y": 90 },
                "facing=north,color=purple,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple" },
                "facing=south,color=purple,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple", "y": 180 },
                "facing=west,color=purple,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple", "y": 270 },
                "facing=east,color=purple,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple", "y": 90 },
                "facing=north,color=purple,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple" },
                "facing=south,color=purple,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple", "y": 180 },
                "facing=west,color=purple,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple", "y": 270 },
                "facing=east,color=purple,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple", "y": 90 },
                "facing=north,color=purple,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple" },
                "facing=south,color=purple,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple", "y": 180 },
                "facing=west,color=purple,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple", "y": 270 },
                "facing=east,color=purple,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple", "y": 90 },
                "facing=north,color=purple,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple_opened" },
                "facing=south,color=purple,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple_opened", "y": 180 },
                "facing=west,color=purple,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple_opened", "y": 270 },
                "facing=east,color=purple,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_purple_opened", "y": 90 },
                "facing=north,color=purple,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple_opened" },
                "facing=south,color=purple,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple_opened", "y": 180 },
                "facing=west,color=purple,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple_opened", "y": 270 },
                "facing=east,color=purple,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_purple_opened", "y": 90 },
                "facing=north,color=purple,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple_opened" },
                "facing=south,color=purple,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple_opened", "y": 180 },
                "facing=west,color=purple,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple_opened", "y": 270 },
                "facing=east,color=purple,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_purple_opened", "y": 90 },
                "facing=north,color=purple,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple_opened" },
                "facing=south,color=purple,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple_opened", "y": 180 },
                "facing=west,color=purple,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple_opened", "y": 270 },
                "facing=east,color=purple,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_purple_opened", "y": 90 },
                "facing=north,color=purple,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=purple,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=purple,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=purple,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=purple,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=purple,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=purple,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=purple,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=purple,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=purple,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=purple,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=purple,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=purple,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=purple,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=purple,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=purple,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=magenta,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=magenta,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=magenta,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=magenta,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=magenta,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=magenta,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=magenta,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=magenta,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=magenta,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=magenta,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=magenta,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=magenta,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=magenta,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=magenta,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=magenta,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=magenta,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=magenta,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta" },
                "facing=south,color=magenta,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta", "y": 180 },
                "facing=west,color=magenta,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta", "y": 270 },
                "facing=east,color=magenta,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta", "y": 90 },
                "facing=north,color=magenta,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta" },
                "facing=south,color=magenta,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta", "y": 180 },
                "facing=west,color=magenta,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta", "y": 270 },
                "facing=east,color=magenta,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta", "y": 90 },
                "facing=north,color=magenta,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta" },
                "facing=south,color=magenta,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta", "y": 180 },
                "facing=west,color=magenta,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta", "y": 270 },
                "facing=east,color=magenta,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta", "y": 90 },
                "facing=north,color=magenta,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta" },
                "facing=south,color=magenta,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta", "y": 180 },
                "facing=west,color=magenta,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta", "y": 270 },
                "facing=east,color=magenta,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta", "y": 90 },
                "facing=north,color=magenta,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta_opened" },
                "facing=south,color=magenta,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta_opened", "y": 180 },
                "facing=west,color=magenta,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta_opened", "y": 270 },
                "facing=east,color=magenta,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_magenta_opened", "y": 90 },
                "facing=north,color=magenta,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta_opened" },
                "facing=south,color=magenta,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta_opened", "y": 180 },
                "facing=west,color=magenta,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta_opened", "y": 270 },
                "facing=east,color=magenta,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_magenta_opened", "y": 90 },
                "facing=north,color=magenta,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta_opened" },
                "facing=south,color=magenta,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta_opened", "y": 180 },
                "facing=west,color=magenta,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta_opened", "y": 270 },
                "facing=east,color=magenta,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_magenta_opened", "y": 90 },
                "facing=north,color=magenta,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta_opened" },
                "facing=south,color=magenta,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta_opened", "y": 180 },
                "facing=west,color=magenta,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta_opened", "y": 270 },
                "facing=east,color=magenta,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_magenta_opened", "y": 90 },
                "facing=north,color=magenta,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=magenta,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=magenta,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=magenta,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=magenta,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=magenta,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=magenta,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=magenta,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=magenta,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=magenta,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=magenta,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=magenta,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=magenta,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=magenta,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=magenta,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=magenta,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=pink,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=pink,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=pink,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=pink,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=pink,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=pink,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=pink,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=pink,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=pink,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=pink,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=pink,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=pink,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=pink,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=pink,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=pink,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=pink,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=pink,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink" },
                "facing=south,color=pink,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink", "y": 180 },
                "facing=west,color=pink,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink", "y": 270 },
                "facing=east,color=pink,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink", "y": 90 },
                "facing=north,color=pink,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink" },
                "facing=south,color=pink,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink", "y": 180 },
                "facing=west,color=pink,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink", "y": 270 },
                "facing=east,color=pink,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink", "y": 90 },
                "facing=north,color=pink,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink" },
                "facing=south,color=pink,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink", "y": 180 },
                "facing=west,color=pink,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink", "y": 270 },
                "facing=east,color=pink,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink", "y": 90 },
                "facing=north,color=pink,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink" },
                "facing=south,color=pink,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink", "y": 180 },
                "facing=west,color=pink,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink", "y": 270 },
                "facing=east,color=pink,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink", "y": 90 },
                "facing=north,color=pink,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink_opened" },
                "facing=south,color=pink,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink_opened", "y": 180 },
                "facing=west,color=pink,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink_opened", "y": 270 },
                "facing=east,color=pink,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_pink_opened", "y": 90 },
                "facing=north,color=pink,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink_opened" },
                "facing=south,color=pink,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink_opened", "y": 180 },
                "facing=west,color=pink,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink_opened", "y": 270 },
                "facing=east,color=pink,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_pink_opened", "y": 90 },
                "facing=north,color=pink,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink_opened" },
                "facing=south,color=pink,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink_opened", "y": 180 },
                "facing=west,color=pink,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink_opened", "y": 270 },
                "facing=east,color=pink,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_pink_opened", "y": 90 },
                "facing=north,color=pink,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink_opened" },
                "facing=south,color=pink,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink_opened", "y": 180 },
                "facing=west,color=pink,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink_opened", "y": 270 },
                "facing=east,color=pink,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_pink_opened", "y": 90 },
                "facing=north,color=pink,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=pink,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=pink,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=pink,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=pink,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=pink,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=pink,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=pink,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=pink,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=pink,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=pink,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=pink,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=pink,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=pink,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=pink,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=pink,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue" },
                "facing=south,color=blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue", "y": 180 },
                "facing=west,color=blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue", "y": 270 },
                "facing=east,color=blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue", "y": 90 },
                "facing=north,color=blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue" },
                "facing=south,color=blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue", "y": 180 },
                "facing=west,color=blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue", "y": 270 },
                "facing=east,color=blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue", "y": 90 },
                "facing=north,color=blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue" },
                "facing=south,color=blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue", "y": 180 },
                "facing=west,color=blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue", "y": 270 },
                "facing=east,color=blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue", "y": 90 },
                "facing=north,color=blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue" },
                "facing=south,color=blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue", "y": 180 },
                "facing=west,color=blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue", "y": 270 },
                "facing=east,color=blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue", "y": 90 },
                "facing=north,color=blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue_opened" },
                "facing=south,color=blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue_opened", "y": 180 },
                "facing=west,color=blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue_opened", "y": 270 },
                "facing=east,color=blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_blue_opened", "y": 90 },
                "facing=north,color=blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue_opened" },
                "facing=south,color=blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue_opened", "y": 180 },
                "facing=west,color=blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue_opened", "y": 270 },
                "facing=east,color=blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_blue_opened", "y": 90 },
                "facing=north,color=blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue_opened" },
                "facing=south,color=blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue_opened", "y": 180 },
                "facing=west,color=blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue_opened", "y": 270 },
                "facing=east,color=blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_blue_opened", "y": 90 },
                "facing=north,color=blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue_opened" },
                "facing=south,color=blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue_opened", "y": 180 },
                "facing=west,color=blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue_opened", "y": 270 },
                "facing=east,color=blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_blue_opened", "y": 90 },
                "facing=north,color=blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=cyan,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=cyan,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=cyan,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=cyan,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=cyan,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=cyan,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=cyan,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=cyan,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=cyan,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=cyan,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=cyan,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=cyan,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=cyan,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=cyan,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=cyan,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=cyan,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=cyan,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan" },
                "facing=south,color=cyan,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan", "y": 180 },
                "facing=west,color=cyan,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan", "y": 270 },
                "facing=east,color=cyan,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan", "y": 90 },
                "facing=north,color=cyan,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan" },
                "facing=south,color=cyan,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan", "y": 180 },
                "facing=west,color=cyan,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan", "y": 270 },
                "facing=east,color=cyan,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan", "y": 90 },
                "facing=north,color=cyan,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan" },
                "facing=south,color=cyan,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan", "y": 180 },
                "facing=west,color=cyan,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan", "y": 270 },
                "facing=east,color=cyan,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan", "y": 90 },
                "facing=north,color=cyan,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan" },
                "facing=south,color=cyan,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan", "y": 180 },
                "facing=west,color=cyan,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan", "y": 270 },
                "facing=east,color=cyan,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan", "y": 90 },
                "facing=north,color=cyan,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan_opened" },
                "facing=south,color=cyan,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan_opened", "y": 180 },
                "facing=west,color=cyan,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan_opened", "y": 270 },
                "facing=east,color=cyan,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_cyan_opened", "y": 90 },
                "facing=north,color=cyan,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan_opened" },
                "facing=south,color=cyan,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan_opened", "y": 180 },
                "facing=west,color=cyan,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan_opened", "y": 270 },
                "facing=east,color=cyan,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_cyan_opened", "y": 90 },
                "facing=north,color=cyan,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan_opened" },
                "facing=south,color=cyan,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan_opened", "y": 180 },
                "facing=west,color=cyan,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan_opened", "y": 270 },
                "facing=east,color=cyan,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_cyan_opened", "y": 90 },
                "facing=north,color=cyan,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan_opened" },
                "facing=south,color=cyan,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan_opened", "y": 180 },
                "facing=west,color=cyan,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan_opened", "y": 270 },
                "facing=east,color=cyan,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_cyan_opened", "y": 90 },
                "facing=north,color=cyan,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=cyan,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=cyan,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=cyan,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=cyan,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=cyan,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=cyan,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=cyan,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=cyan,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=cyan,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=cyan,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=cyan,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=cyan,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=cyan,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=cyan,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=cyan,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=light_blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=light_blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=light_blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=light_blue,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=light_blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=light_blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=light_blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=light_blue,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=light_blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=light_blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=light_blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=light_blue,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=light_blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=light_blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=light_blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=light_blue,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=light_blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue" },
                "facing=south,color=light_blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue", "y": 180 },
                "facing=west,color=light_blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue", "y": 270 },
                "facing=east,color=light_blue,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue", "y": 90 },
                "facing=north,color=light_blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue" },
                "facing=south,color=light_blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue", "y": 180 },
                "facing=west,color=light_blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue", "y": 270 },
                "facing=east,color=light_blue,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue", "y": 90 },
                "facing=north,color=light_blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue" },
                "facing=south,color=light_blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue", "y": 180 },
                "facing=west,color=light_blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue", "y": 270 },
                "facing=east,color=light_blue,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue", "y": 90 },
                "facing=north,color=light_blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue" },
                "facing=south,color=light_blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue", "y": 180 },
                "facing=west,color=light_blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue", "y": 270 },
                "facing=east,color=light_blue,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue", "y": 90 },
                "facing=north,color=light_blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue_opened" },
                "facing=south,color=light_blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue_opened", "y": 180 },
                "facing=west,color=light_blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue_opened", "y": 270 },
                "facing=east,color=light_blue,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_light_blue_opened", "y": 90 },
                "facing=north,color=light_blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue_opened" },
                "facing=south,color=light_blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue_opened", "y": 180 },
                "facing=west,color=light_blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue_opened", "y": 270 },
                "facing=east,color=light_blue,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_light_blue_opened", "y": 90 },
                "facing=north,color=light_blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue_opened" },
                "facing=south,color=light_blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue_opened", "y": 180 },
                "facing=west,color=light_blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue_opened", "y": 270 },
                "facing=east,color=light_blue,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_light_blue_opened", "y": 90 },
                "facing=north,color=light_blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue_opened" },
                "facing=south,color=light_blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue_opened", "y": 180 },
                "facing=west,color=light_blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue_opened", "y": 270 },
                "facing=east,color=light_blue,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_light_blue_opened", "y": 90 },
                "facing=north,color=light_blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=light_blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=light_blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=light_blue,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=light_blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=light_blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=light_blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=light_blue,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=light_blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=light_blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=light_blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=light_blue,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=light_blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=light_blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=light_blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=light_blue,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=green,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=green,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=green,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=green,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=green,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=green,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=green,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=green,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=green,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=green,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=green,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=green,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=green,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=green,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=green,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=green,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=green,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green" },
                "facing=south,color=green,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green", "y": 180 },
                "facing=west,color=green,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green", "y": 270 },
                "facing=east,color=green,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green", "y": 90 },
                "facing=north,color=green,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green" },
                "facing=south,color=green,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green", "y": 180 },
                "facing=west,color=green,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green", "y": 270 },
                "facing=east,color=green,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green", "y": 90 },
                "facing=north,color=green,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green" },
                "facing=south,color=green,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green", "y": 180 },
                "facing=west,color=green,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green", "y": 270 },
                "facing=east,color=green,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green", "y": 90 },
                "facing=north,color=green,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green" },
                "facing=south,color=green,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green", "y": 180 },
                "facing=west,color=green,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green", "y": 270 },
                "facing=east,color=green,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green", "y": 90 },
                "facing=north,color=green,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green_opened" },
                "facing=south,color=green,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green_opened", "y": 180 },
                "facing=west,color=green,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green_opened", "y": 270 },
                "facing=east,color=green,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_green_opened", "y": 90 },
                "facing=north,color=green,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green_opened" },
                "facing=south,color=green,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green_opened", "y": 180 },
                "facing=west,color=green,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green_opened", "y": 270 },
                "facing=east,color=green,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_green_opened", "y": 90 },
                "facing=north,color=green,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green_opened" },
                "facing=south,color=green,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green_opened", "y": 180 },
                "facing=west,color=green,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green_opened", "y": 270 },
                "facing=east,color=green,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_green_opened", "y": 90 },
                "facing=north,color=green,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green_opened" },
                "facing=south,color=green,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green_opened", "y": 180 },
                "facing=west,color=green,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green_opened", "y": 270 },
                "facing=east,color=green,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_green_opened", "y": 90 },
                "facing=north,color=green,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=green,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=green,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=green,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=green,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=green,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=green,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=green,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=green,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=green,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=green,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=green,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=green,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=green,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=green,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=green,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                
                "facing=north,color=lime,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=lime,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=lime,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=lime,variant=normal,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=lime,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=lime,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=lime,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=lime,variant=left,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=lime,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=lime,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=lime,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=lime,variant=right,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=lime,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=lime,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=lime,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=lime,variant=center,dressed=false,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 },
                "facing=north,color=lime,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime" },
                "facing=south,color=lime,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime", "y": 180 },
                "facing=west,color=lime,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime", "y": 270 },
                "facing=east,color=lime,variant=normal,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime", "y": 90 },
                "facing=north,color=lime,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime" },
                "facing=south,color=lime,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime", "y": 180 },
                "facing=west,color=lime,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime", "y": 270 },
                "facing=east,color=lime,variant=left,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime", "y": 90 },
                "facing=north,color=lime,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime" },
                "facing=south,color=lime,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime", "y": 180 },
                "facing=west,color=lime,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime", "y": 270 },
                "facing=east,color=lime,variant=right,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime", "y": 90 },
                "facing=north,color=lime,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime" },
                "facing=south,color=lime,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime", "y": 180 },
                "facing=west,color=lime,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime", "y": 270 },
                "facing=east,color=lime,variant=center,dressed=true,opened=false": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime", "y": 90 },
                "facing=north,color=lime,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime_opened" },
                "facing=south,color=lime,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime_opened", "y": 180 },
                "facing=west,color=lime,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime_opened", "y": 270 },
                "facing=east,color=lime,variant=normal,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_dressed_lime_opened", "y": 90 },
                "facing=north,color=lime,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime_opened" },
                "facing=south,color=lime,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime_opened", "y": 180 },
                "facing=west,color=lime,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime_opened", "y": 270 },
                "facing=east,color=lime,variant=left,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left_dressed_lime_opened", "y": 90 },
                "facing=north,color=lime,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime_opened" },
                "facing=south,color=lime,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime_opened", "y": 180 },
                "facing=west,color=lime,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime_opened", "y": 270 },
                "facing=east,color=lime,variant=right,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right_dressed_lime_opened", "y": 90 },
                "facing=north,color=lime,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime_opened" },
                "facing=south,color=lime,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime_opened", "y": 180 },
                "facing=west,color=lime,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime_opened", "y": 270 },
                "facing=east,color=lime,variant=center,dressed=true,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center_dressed_lime_opened", "y": 90 },
                "facing=north,color=lime,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME" },
                "facing=south,color=lime,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 180 },
                "facing=west,color=lime,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 270 },
                "facing=east,color=lime,variant=normal,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME", "y": 90 },
                "facing=north,color=lime,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left" },
                "facing=south,color=lime,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 180 },
                "facing=west,color=lime,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 270 },
                "facing=east,color=lime,variant=left,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_left", "y": 90 },
                "facing=north,color=lime,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right" },
                "facing=south,color=lime,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 180 },
                "facing=west,color=lime,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 270 },
                "facing=east,color=lime,variant=right,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_right", "y": 90 },
                "facing=north,color=lime,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center" },
                "facing=south,color=lime,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 180 },
                "facing=west,color=lime,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 270 },
                "facing=east,color=lime,variant=center,dressed=false,opened=true": { "model": "aestheticedges:block/curtain_rod_NAME_center", "y": 90 }
              }
            }
            """;
}