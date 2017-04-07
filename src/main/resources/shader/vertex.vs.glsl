#version 330

// starting from the position 0, we are expecting to receive a vector composed
// of 3 attributes (x,y,z)
layout (location=0) in vec3 position;

void main() {
    gl_Position = vec4(position, 1.0);
}
